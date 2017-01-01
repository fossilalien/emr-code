package pkuhit.iih.mr.wr;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseBizModel;
import java.util.Date;









public static final   String  PK = "MRB03.AT01";
// 医疗记录主键
public static final   String  MEDICAL_RECORD_PK = "MRB03.AT02";
// 审签级别编码
public static final   String  SIGN_LEVEL_CODE = "MRB03.AT03";
// 审签时间
public static final   String  SIGN_TIME = "MRB03.AT04";
// 审签人ID
public static final   String  SIGN_USER_ID = "MRB03.AT05";
// 审签科室编码
public static final   String  SIGN_DEPT_CODE = "MRB03.AT06";


@Column(name="MR_SIGN_PK") 
private  String pk;

@Column(name="MR_PK") 
private  String medicalRecordPk;

@Column(name="SIGN_LVL_CD") 
private  String signLevelCode;

@Column(name="SIGN_TIME") 
private  Date signTime;

@Column(name="SIGN_USER_ID") 
private  String signUserId;

@Column(name="SIGN_DEPT_CD") 
private  String signDeptCode;
// 审签级别名称
@DictionaryTag(code = "signLevelCode")
private  String signLevelName;
// 审签人名
//@DictionaryTag(code = "signUserId")
private  String signUserName;
// 审签科室名称
//@DictionaryTag(code = "signDeptCode")
private  String signDeptName;

 {
     return this.pk;
 }

 {
  this.pk = pk;
 }

 {
     return this.medicalRecordPk;
 }

 {
  this.medicalRecordPk = medicalRecordPk;
 }

 {
     return this.signLevelCode;
 }

 {
  this.signLevelCode = signLevelCode;
 }

 {
     return this.signTime;
 }

 {
  this.signTime = signTime;
 }

 {
     return this.signUserId;
 }

 {
  this.signUserId = signUserId;
 }

 {
     return this.signDeptCode;
 }

 {
  this.signDeptCode = signDeptCode;
 }

 {
     return this.signLevelName;
 }

 {
  this.signLevelName = signLevelName;
 }

 {
     return this.signUserName;
 }

 {
  this.signUserName = signUserName;
 }

 {
     return this.signDeptName;
 }

 {
  this.signDeptName = signDeptName;
 }

