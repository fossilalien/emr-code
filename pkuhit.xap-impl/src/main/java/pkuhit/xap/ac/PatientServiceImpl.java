package pkuhit.xap.ac;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.time.DateUtils;
import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import bjca.org.util.DateUtil;
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
        
      //根据入院日期计算出随访状态
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DAY_OF_MONTH, -7);
		Date day7Before2 = cal.getTime();
		
		cal.add(Calendar.DAY_OF_MONTH, +14);
		Date day7After2 = cal.getTime();
		
		Date date = new Date();
		try {
			date = iemrPatient.getAdmissionDate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		cal.setTime(date);
		cal.add(Calendar.MONTH, +3);
		Date after3m = cal.getTime();
		
		cal.add(Calendar.MONTH, +3);
		Date after6m = cal.getTime();
		
		cal.add(Calendar.MONTH, +6);
		Date after1y = cal.getTime();
		
		cal.add(Calendar.MONTH, +24);
		Date after3y = cal.getTime();
		
		cal.add(Calendar.MONTH, +24);
		Date after5y = cal.getTime();
		
		String fuStatus = "";
		if(day7Before2.compareTo(after3m)<0 && day7After2.compareTo(after3m)>0){
			if("1".equalsIgnoreCase(iemrPatient.getFuFlag())){
				fuStatus = "待随访（3M）";
			}else if("2".equalsIgnoreCase(iemrPatient.getFuFlag())){
				fuStatus = "已随访（3M）";
			}else if("3".equalsIgnoreCase(iemrPatient.getFuFlag())){
				fuStatus = "已忽略（3M）";
			}
		}else if(day7Before2.compareTo(after6m)<0 && day7After2.compareTo(after6m)>0){
			if("1".equalsIgnoreCase(iemrPatient.getFuFlag())){
				fuStatus = "待随访（6M）";
			}else if("2".equalsIgnoreCase(iemrPatient.getFuFlag())){
				fuStatus = "已随访（6M）";
			}else if("3".equalsIgnoreCase(iemrPatient.getFuFlag())){
				fuStatus = "已忽略（6M）";
			}
		}else if(day7Before2.compareTo(after1y)<0 && day7After2.compareTo(after1y)>0){
			if("1".equalsIgnoreCase(iemrPatient.getFuFlag())){
				fuStatus = "待随访（1Y）";
			}else if("2".equalsIgnoreCase(iemrPatient.getFuFlag())){
				fuStatus = "已随访（1Y）";
			}else if("3".equalsIgnoreCase(iemrPatient.getFuFlag())){
				fuStatus = "已忽略（1Y）";
			}
		}else if(day7Before2.compareTo(after3y)<0 && day7After2.compareTo(after3y)>0){
			if("1".equalsIgnoreCase(iemrPatient.getFuFlag())){
				fuStatus = "待随访（3Y）";
			}else if("2".equalsIgnoreCase(iemrPatient.getFuFlag())){
				fuStatus = "已随访（3Y）";
			}else if("3".equalsIgnoreCase(iemrPatient.getFuFlag())){
				fuStatus = "已忽略（3Y）";
			}
		}else if(day7Before2.compareTo(after5y)<0 && day7After2.compareTo(after5y)>0){
			if("1".equalsIgnoreCase(iemrPatient.getFuFlag())){
				fuStatus = "待随访（5Y）";
			}else if("2".equalsIgnoreCase(iemrPatient.getFuFlag())){
				fuStatus = "已随访（5Y）";
			}else if("3".equalsIgnoreCase(iemrPatient.getFuFlag())){
				fuStatus = "已忽略（5Y）";
			}
		}
		//patient.setFuStatus(fuStatus);
        patient.setFlag(flag);
        patient.setxRay(patient.getXRay());
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
        
        byte[] bytes = condition.getBytes();   
        try {
			String s1 = new String(bytes,"GBK");
			String s2 = new String(bytes,"UTF-8");
			System.out.println("utf-8 值:"+s2);
		    System.out.println("GBK 值:"+s1);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        String s3="";
        try {
        	s3 = new String(condition.getBytes("ISO-8859-1"),"UTF-8");
        	System.out.println("encodeURI:"+s3);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        
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
	        System.out.println("查询值  value =="+value);
	       
	        if (!StringUtils.hasText(value))
	        {
	            return null;
	        }
	        return value;
	 }
	 
	 public static String getURLEncoderString(String str,String ucode) {
	        String result = "";
	        if (null == str) {
	            return "";
	        }
	        try {
	            result = java.net.URLEncoder.encode(str, ucode);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return result;
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
