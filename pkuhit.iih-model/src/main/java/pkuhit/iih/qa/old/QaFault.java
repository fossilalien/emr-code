package pkuhit.iih.qa.old;

import java.util.Date;

import xap.model.BaseBizModel;
import xap.sv.annotation.Column;
import xap.sv.annotation.DictionaryTag;









public static final String   OBJ_CD  = "QAB03";

//缺陷确认结果编码 未确认
public static final   String  FLT_CFM_RST_CD_UNCONFIRMED= "QAM07.01";
//缺陷确认结果编码 需整改
public static final   String  FLT_CFM_RST_CD_NEEDREFORM= "QAM07.02";
//缺陷确认结果编码 需扣分
public static final   String  FLT_CFM_RST_CD_NEETDROPSCORE= "QAM07.03";
//缺陷确认结果编码 不扣分
public static final   String  FLT_CFM_RST_CD_NONDROPSCORE= "QAM07.04";


//质控项目扣分类型 仅一次扣
public static final   String  QA_TYPE_CODE_ONCE= "QAM02.01";
//质控项目扣分类型 可多次扣分
public static final   String  QA_TYPE_CODE_MTO= "QAM02.02";
//质控项目扣分类型 单否乙级
public static final   String  QA_TYPE_CODE_GRADEB= "QAM02.03";
//质控项目扣分类型 单否丙级
public static final   String  QA_TYPE_CODE_GRADEC= "QAM02.04";


//缺陷状态 新建
public static final   String  STATUS_CODE_CREATED= "QAM01.01";
//缺陷状态 已提出
public static final   String  STATUS_CODE_SUBMITTED= "QAM01.02";
//缺陷状态 已整改
public static final   String  STATUS_CODE_REFORMED= "QAM01.03";
//缺陷状态 已审核
public static final   String  STATUS_CODE_VERIFIED= "QAM01.04";

public static final   String  PK = "QAB03.AT01";
// 质控项目主键
public static final   String  QA_ITEM_PK = "QAB03.AT02";
// 质控体系质控项目编码
public static final   String  QA_SYSTEM_ITEM_CODE = "QAB03.AT03";
// 质控目标对象编码
public static final   String  TARGET_OBJECT_CODE = "QAB03.AT04";
// 质控目标对象主键
public static final   String  TARGET_OBJECT_PK = "QAB03.AT05";
// 质控来源对象编码
public static final   String  SOURCE_OBJECT_CODE = "QAB03.AT06";
// 质控来源对象主键
public static final   String  SOURCE_OBJECT_PK = "QAB03.AT07";
// 缺陷状态编码
public static final   String  STATUS_CODE = "QAB03.AT08";
// 提出时间
public static final   String  SUBMITTED_TIME = "QAB03.AT09";
// 提出人ID
public static final   String  SUBMITTED_USER_ID = "QAB03.AT10";
// 提出科室编码
public static final   String  SUBMITTED_DEPT_CODE = "QAB03.AT11";
// 整改要求
public static final   String  REFORM_REQUIREMENT = "QAB03.AT12";
// 整改标志
public static final   String  REFORM_FLAG = "QAB03.AT13";
// 整改时间
public static final   String  REFORMED_TIME = "QAB03.AT14";
// 整改人ID
public static final   String  REFORMED_USER_ID = "QAB03.AT15";
// 整改科室编码
public static final   String  REFORMED_DEPT_CODE = "QAB03.AT16";
// 整改说明
public static final   String  REFORMED_DESCRIPTION = "QAB03.AT17";
// 审核时间
public static final   String  VERIFIED_TIME = "QAB03.AT18";
// 审核者ID
public static final   String  VERIFIED_USER_ID = "QAB03.AT19";
// 审核科室编码
public static final   String  VERIFIED_DEPT_CODE = "QAB03.AT20";
// 扣分标志
public static final   String  DROP_FLAG = "QAB03.AT21";
// 扣分说明
public static final   String  DROP_DESCRIPTION = "QAB03.AT22";
// 段落类型编码
public static final   String  SEGMENT_TYPE_CODE = "QAB03.AT23";
// 缺陷来源编码
public static final   String  FAULT_FROM_CODE = "QAB03.AT24";
// 质控类型-环节质控
public static final   String  QA_TY_CD_PROCESS = "QAM13.01";
//质控类型-科室质控
public static final   String  QA_TY_CD_DEPT = "QAM13.02";
//质控类型-终末质控
public static final   String  QA_TY_CD_TERMINAL = "QAM13.03";




@Column(name="QA_FLT_PK") 
private  String pk;

@Column(name="QA_ITM_PK") 
private  String qaItemPk;

@Column(name="EN_PK") 
private  String enPk;

//就诊编码
@Column(name="QA_SYS_ITM_CD") 
private  String qaSystemItemCode;

@Column(name="TAR_OBJ_CD") 
private  String targetObjectCode;

@Column(name="TAR_OBJ_PK") 
private  String targetObjectPk;

@Column(name="SRC_OBJ_CD") 
private  String sourceObjectCode;

@Column(name="SRC_OBJ_PK") 
private  String sourceObjectPk;

@Column(name="FLT_STA_CD") 
private  String statusCode;

@Column(name="SBMT_TIME") 
private  Date submittedTime;

@Column(name="SBMT_USER_ID") 
private  String submittedUserId;

@Column(name="SBMT_DEPT_CD") 
private  String submittedDeptCode;

@Column(name="RFM_REQ") 
private  String reformRequirement;

@Column(name="RFM_TIME") 
private  Date reformedTime;

@Column(name="RFM_USER_ID") 
private  String reformedUserId;

@Column(name="RFM_DEPT_CD") 
private  String reformedDeptCode;

@Column(name="RFM_DES") 
private  String reformedDescription;

@Column(name="VRF_TIME") 
private  Date verifiedTime;

@Column(name="VRF_USER_ID") 
private  String verifiedUserId;

@Column(name="VRF_DEPT_CD") 
private  String verifiedDeptCode;

@Column(name="DRP_DES") 
private  String dropDescription;

@Column(name="SEG_TP_CD") 
private  String segmentTypeCode;

@Column(name="FLT_FROM_CD") 
private  String faultFromCode;

//缺陷确认结果编码
@Column(name="FLT_CFM_RST_CD")
private String faultConfirmResult;

//缺陷确认结果编码名称
@DictionaryTag(code = "faultConfirmResultName",objCd ="QAM07")
private String faultConfirmResultName;

// 缺陷状态名称
@DictionaryTag(code = "statusCode",objCd ="QAM12")
private  String statusName;

// 提出人名
//@DictionaryTag(code = "submittedUserId",objCd ="XAPM12")
private  String submittedUserName;

// 提出科室名称
//@DictionaryTag(code = "submittedDeptCode",objCd ="ORGB01")
private  String submittedDeptName;

// 整改人名
//@DictionaryTag(code = "reformedUserId",objCd ="XAPM12")
private  String reformedUserName;

// 整改科室名称
//@DictionaryTag(code = "reformedDeptCode",objCd ="ORGB01")
private  String reformedDeptName;

// 审核者名
//@DictionaryTag(code = "verifiedUserId",objCd ="XAPM12")
private  String verifiedUserName;

// 审核科室名称
//@DictionaryTag(code = "verifiedDeptCode",objCd ="ORGB01")
private  String verifiedDeptName;

// 段落类型名称
@DictionaryTag(code = "segmentTypeCode",objCd ="MRM01")
private  String segmentTypeName;

// 缺陷来源名称
@DictionaryTag(code = "faultFromCode",objCd ="QAM05")
private  String faultFromName;

// 逾期标志
@Column(name = "CANOVERDUE")
private  BigDecimal canOverdue;

// 可编辑标志
@Column(name = "CANEDIT")
private  BigDecimal canEdit;

// 质控目标对象名称
@DictionaryTag(code = "targetObjectCode",objCd ="MEB02")
private  String targetObjectName;

//医疗文书名称
@Column(name = "MRNAME")
private  String mrName;

// 质控体系质控项目名称
@Column(name = "QASYSTEMITEMNAME")
private  String qaSystemItemName;

/*// 单次扣分值
@Column(name = "ONCEDROPSCORE")
private  BigDecimal onceDropScore;*/

// 截止日期
@Column(name = "DEADLINE")
private  Date deadline;

// 质控来源对象名称
@DictionaryTag(code = "sourceObjectCode",objCd ="MEB02")
private  String sourceObjectName;

//质控工作记录编码
@Column(name = "QAPK")
private String qaPk;

//可整改标志
@Column(name = "CANREFORM")
private  BigDecimal canReform;

// 质控通知 主键
@Column(name = "REVISION_CD")
private  String revisionCd;

//质控通知 主键
@Column(name = "QA_TY_CD")
private  String qaTypeCode;


//扣分标准-质控项目表
@Column(name = "ONCE_DRP_SCR")
private  BigDecimal onceDropScore;

//扣分标准-质控项目表
@Column(name = "REQ")
private  String req;

public String getRevisionCd() {
	return revisionCd;
}

public void setRevisionCd(String revisionCd) {
	this.revisionCd = revisionCd;
}

public String getPk()
 {
     return this.pk;
 }

 {
  this.pk = pk;
 }

 {
     return this.qaItemPk;
 }

 {
  this.qaItemPk = qaItemPk;
 }

 {
     return this.qaSystemItemCode;
 }

 {
  this.qaSystemItemCode = qaSystemItemCode;
 }

 {
     return this.targetObjectCode;
 }

 {
  this.targetObjectCode = targetObjectCode;
 }

 {
     return this.targetObjectPk;
 }

 {
  this.targetObjectPk = targetObjectPk;
 }

 {
     return this.sourceObjectCode;
 }

 {
  this.sourceObjectCode = sourceObjectCode;
 }

 {
     return this.sourceObjectPk;
 }

 {
  this.sourceObjectPk = sourceObjectPk;
 }

 {
     return this.statusCode;
 }

 {
  this.statusCode = statusCode;
 }

 {
     return this.submittedUserId;
 }

 {
  this.submittedUserId = submittedUserId;
 }

 {
     return this.submittedDeptCode;
 }

 {
  this.submittedDeptCode = submittedDeptCode;
 }

 {
     return this.reformRequirement;
 }

 {
  this.reformRequirement = reformRequirement;
 }

 {
     return this.reformedUserId;
 }

 {
  this.reformedUserId = reformedUserId;
 }

 {
     return this.reformedDeptCode;
 }

 {
  this.reformedDeptCode = reformedDeptCode;
 }

 {
     return this.reformedDescription;
 }

 {
  this.reformedDescription = reformedDescription;
 }

 {
     return this.verifiedUserId;
 }

 {
  this.verifiedUserId = verifiedUserId;
 }

 {
     return this.verifiedDeptCode;
 }

 {
  this.verifiedDeptCode = verifiedDeptCode;
 }

 {
     return this.dropDescription;
 }

 {
  this.dropDescription = dropDescription;
 }

 {
     return this.segmentTypeCode;
 }

 {
  this.segmentTypeCode = segmentTypeCode;
 }

 {
     return this.faultFromCode;
 }

 {
  this.faultFromCode = faultFromCode;
 }

 {
     return this.statusName;
 }

 {
  this.statusName = statusName;
 }

 {
     return this.submittedUserName;
 }

 {
  this.submittedUserName = submittedUserName;
 }

 {
     return this.submittedDeptName;
 }

 {
  this.submittedDeptName = submittedDeptName;
 }

 {
     return this.reformedUserName;
 }

 {
  this.reformedUserName = reformedUserName;
 }

 {
     return this.reformedDeptName;
 }

 {
  this.reformedDeptName = reformedDeptName;
 }

 {
     return this.verifiedUserName;
 }

 {
  this.verifiedUserName = verifiedUserName;
 }

 {
     return this.verifiedDeptName;
 }

 {
  this.verifiedDeptName = verifiedDeptName;
 }

 {
     return this.segmentTypeName;
 }

 {
  this.segmentTypeName = segmentTypeName;
 }

 {
     return this.faultFromName;
 }

 {
  this.faultFromName = faultFromName;
 }

 {
     return this.canOverdue;
 }

 {
  this.canOverdue = canOverdue;
 }

 {
     return this.canEdit;
 }

 {
  this.canEdit = canEdit;
 }

 {
     return this.targetObjectName;
 }

 {
  this.targetObjectName = targetObjectName;
 }

 {
     return this.qaSystemItemName;
 }

 {
  this.qaSystemItemName = qaSystemItemName;
 }

 {
     return this.onceDropScore;
 }

 {
  this.onceDropScore = onceDropScore;
 }

 {
     return this.sourceObjectName;
 }

 {
  this.sourceObjectName = sourceObjectName;
 }

public String getQaPk() {
	return qaPk;
}

public void setQaPk(String qaPk) {
	this.qaPk = qaPk;
}

public String getMrName() {
	return mrName;
}

public void setMrName(String mrName) {
	this.mrName = mrName;
}

public BigDecimal getCanReform() {
	return canReform;
}

public void setCanReform(BigDecimal canReform) {
	this.canReform = canReform;
}

public String getFaultConfirmResult() {
	return faultConfirmResult;
}

public void setFaultConfirmResult(String faultConfirmResult) {
	this.faultConfirmResult = faultConfirmResult;
}

public String getFaultConfirmResultName() {
	return faultConfirmResultName;
}

public void setFaultConfirmResultName(String faultConfirmResultName) {
	this.faultConfirmResultName = faultConfirmResultName;
}

public Date getSubmittedTime() {
	return submittedTime;
}

public void setSubmittedTime(Date submittedTime) {
	this.submittedTime = submittedTime;
}

public Date getReformedTime() {
	return reformedTime;
}

public void setReformedTime(Date reformedTime) {
	this.reformedTime = reformedTime;
}

public Date getVerifiedTime() {
	return verifiedTime;
}

public void setVerifiedTime(Date verifiedTime) {
	this.verifiedTime = verifiedTime;
}

public Date getDeadline() {
	return deadline;
}

public void setDeadline(Date deadline) {
	this.deadline = deadline;
}

public String getEnPk() {
	return enPk;
}

public void setEnPk(String enPk) {
	this.enPk = enPk;
}

public String getQaTypeCode() {
	return qaTypeCode;
}

public void setQaTypeCode(String qaTypeCode) {
	this.qaTypeCode = qaTypeCode;
}

public String getReq() {
	return req;
}

public void setReq(String req) {
	this.req = req;
}

}