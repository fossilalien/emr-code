package pkuhit.xap.ac;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import pkuhit.iih.di.DiagnosisModel;
import pkuhit.iih.mr.wr.Amr;
import pkuhit.xap.dao.auto.IemrPatientDao;
import pkuhit.xap.dao.auto.entity.IemrPatient;
import pkuhit.xap.util.BeanCopyUtil;
import xap.sv.model.ArrayResult;
import xap.sv.model.ArrayResultBuilder;
import xap.sv.model.SingleResult;
import xap.sv.model.SingleResultBuilder;
import xap.util.UUIDGenerator;
public class PatientServiceImpl implements PatientService
{
    @Autowired
    IemrPatientDao imerPatientDao;

    //新建患者
	@Override
	public Patient create(Patient patient) {
		IemrPatient iemrPatient = new IemrPatient();
		BeanCopyUtil.modelToEntity(iemrPatient, patient);
		iemrPatient.setDelF((short)0);
		//新建患者时默认都要随访
		iemrPatient.setFuFlag("1");
		iemrPatient.setPatientId(UUIDGenerator.getUUID());
		iemrPatient.setCrtTime(new Timestamp(new Date().getTime()));
		iemrPatient.setLastUpdTime(new Timestamp(new Date().getTime()));
		iemrPatient.setUpdCnt(BigInteger.valueOf(1));
		imerPatientDao.insertExludeNull(iemrPatient);
		return patient;
	}

	/**
	 * 更新患者信息
	 */
	@Override
	public SingleResult<Patient> update(String patientId, Patient patient) {
		patient.setPatientId(patientId);
		IemrPatient iemrPatient = imerPatientDao.selectIemrPatientById(patientId);
		BigInteger newUpdCnt = iemrPatient.getUpdCnt().add(BigInteger.valueOf(1));
		BeanCopyUtil.modelToEntity(iemrPatient, patient);
		iemrPatient.setLastUpdTime(new Timestamp(new Date().getTime()));
		iemrPatient.setUpdCnt(newUpdCnt);
		imerPatientDao.updateExcludeNull(iemrPatient);
		SingleResultBuilder<Patient> builder = SingleResultBuilder.newSingleResult(Patient.class);
        builder.withData(iemrPatient);
		return builder.build();
	}

	@Override
	public SingleResult<Patient> selectIemrPatientById(String patientId,String flag) {
        IemrPatient iemrPatient = imerPatientDao.selectIemrPatientById(patientId);
        Patient patient = this.wrapData(iemrPatient);
        if("0".equalsIgnoreCase(patient.getSex())){
        	patient.setSexValue("女");
        }else if("1".equalsIgnoreCase(patient.getSex())){
        	patient.setSexValue("男");
        }else if("-1".equalsIgnoreCase(patient.getSex())){
        	patient.setSexValue("未知的性别");
        }
        patient.setFlag(flag);
        SingleResultBuilder<Patient> builder = SingleResultBuilder.newSingleResult(Patient.class);
        builder.withData(patient);
		return builder.build();
	}

	@Override
	public String delete(String patientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayResult<Patient> search(Map<String, String> params) {

    	//■ 查询数据
        String pageNum = null;
		String pageSize = null;
		if (params.containsKey("pageNum") && params.containsKey("pageSize")) {
			pageNum = (String) params.get("pageNum");
			pageSize = (String) params.get("pageSize");
		}
		if (org.apache.commons.lang3.StringUtils.isBlank(pageNum)) {
			pageNum = "1";
		}
		if (org.apache.commons.lang3.StringUtils.isBlank(pageSize)) {
			pageSize = "20";
		}
		SelectOptions options = SelectOptions.get().offset((Integer.valueOf(pageNum) - 1) * Integer.valueOf(pageSize))
				.limit(Integer.valueOf(pageSize)).count();
		 //wangyanli add 添加参数 dctNsF 2016-11-8
        String condition = getParamValue(params, "condition");
        if("输入姓名、住院号、手机号检索".equalsIgnoreCase(condition)){
        	condition = null;
        }
        List<IemrPatient> list = imerPatientDao.selectIemrPatientList(condition,options);
        
        //■　装配并返回
        ArrayResultBuilder<Patient> builder = ArrayResultBuilder.newArrayResult(Patient.class);
        int size = 0;
        if (list != null && list.size() > 0)
        {
            Patient[] patientList = new Patient[list.size()];
            int i = 0;
            for (IemrPatient iemrPatient : list)
            {
            	patientList[i] = this.wrapData(iemrPatient);
                i++;
            }
            
            builder.withData(patientList);
            size = patientList.length;
        }
        
        ArrayResult<Patient> arrayResult = builder.build();
        arrayResult.setTotal(Integer.valueOf(options.getCount()+""));
        return arrayResult;
    
	}
	
	 private Patient wrapData(IemrPatient imerPatient) {
	    	Patient patient = new Patient();
	    	BeanCopyUtil.entityToModel(patient, imerPatient, null, null);
	    	return patient;
	 }
	 
	 String getParamValue(Map<String, String> params, String paramName){
	        String value = params.get(paramName);
	        if (!StringUtils.hasText(value))
	        {
	            return null;
	        }
	        return value;
	 }
	 
	 
	 @Override
    public SingleResult<Patient> getEncounterById(String id) throws Throwable {
	    SingleResult<Patient> result;
        SingleResultBuilder<Patient> builder = SingleResultBuilder.newSingleResult(Patient.class);
        IemrPatient iemrPatient = imerPatientDao.selectIemrPatientById(id);
        if (null != iemrPatient) {
        	Patient patient = this.wrapData(iemrPatient);
            if("0".equalsIgnoreCase(patient.getSex())){
            	patient.setSexValue("女");
            }else if("1".equalsIgnoreCase(patient.getSex())){
            	patient.setSexValue("男");
            }else if("-1".equalsIgnoreCase(patient.getSex())){
            	patient.setSexValue("未知的性别");
            }
            builder.withData(patient);
        }
        result = builder.build();
        return result;
    }
}
