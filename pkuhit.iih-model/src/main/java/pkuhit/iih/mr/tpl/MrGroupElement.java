package pkuhit.iih.mr.tpl;


import xap.model.BaseMasterModel;
import xap.sv.annotation.Column;
import xap.sv.annotation.DictionaryTag;










// 医疗记录组合元素编码
public static final   String  CODE = "MRK06.AT01";
// 组织机构编码
public static final   String  ORGANIZATION_CODE = "MRK06.AT02";
// 文件主键
public static final   String  FILE_PK = "MRK06.AT03";
// 根医疗记录组合元素编码
public static final   String  ROOT_CODE = "MRK06.AT04";
// 版本号
public static final   String  VERSION_NO = "MRK06.AT05";
// 医疗记录组合元素类型编码
public static final   String  TYPE_CODE = "MRK06.AT06";
// 医疗记录组合元素状态编码
public static final   String  STATUS_CODE = "MRK06.AT07";
// 名称
public static final   String  NAME = "MRK06.AT08";
// 描述
public static final   String  DESCRIPTION = "MRK06.AT09";
// 所属类型编码
public static final   String  OWNER_TYPE_CODE = "MRK06.AT10";
// 所属编码
public static final   String  OWNER_CODE = "MRK06.AT11";
// 医疗记录组合元素的自定义分类编码
public static final   String  CUSTOM_CATEGORY_CODE = "MRK06.AT19";


@Column(name="MR_GE_CD") 
private  String code;

@Column(name="ORG_CD") 
private  String organizationCode;

@Column(name="FILE_PK") 
private  String filePk;

//Added by wujunhui 2014/12/12
// 文件
private String odtFile;

@Column(name="RT_MR_EG_CD") 
private  String rootCode;

@Column(name="VER_NO") 
private  BigInteger versionNo;

@Column(name="MR_GE_TP_CD") 
private  String typeCode;

@Column(name="MR_GE_STA_CD") 
private  String statusCode;

@Column(name="NM") 
private  String name;

@Column(name="DES") 
private  String description;

@Column(name="OWN_TP_CD") 
private  String ownerTypeCode;

@Column(name="OWN_CD") 
private  String ownerCode;
// 组织机构名称
//@DictionaryTag(code = "organizationCode",objCd ="ORGB01")
private  String organizationName;
// 医疗记录组合元素类型名称
@DictionaryTag(code = "typeCode",objCd ="MRM11")
private  String typeName;
// 医疗记录组合元素状态名称
@DictionaryTag(code = "statusCode",objCd ="MRM05")
private  String statusName;
// 所属类型名称
@DictionaryTag(code = "ownerTypeCode",objCd ="MDM08")
private  String ownerTypeName;
// 所属名称
//@DictionaryTag(code = "ownerCode",objCd ="null")
private  String ownerName;
// 可删除标志
private  Integer canDelete;
// 可升级标志
private  Integer canUpgrade;

@Column(name="MR_GE_CCAT_CD") 
private  String customCategoryCode;
// 可启用标志
private  Integer canActivated;
// 可停用标志
private  Integer canStop;
// 可驳回标志
private  Integer canReject;
// 医疗记录组合元素的自定义分类名称
@DictionaryTag(code = "customCategoryCode",objCd ="MRM19")
private  String customCategoryName;
// 可审批标志
private  Integer canReview;
// 可提交标志
private  Integer canSubmit;
//可更改标志
private  Integer canUpdate;

	return canUpdate;
}

public void setCanUpdate(Integer canUpdate) {
	this.canUpdate = canUpdate;
}

public String getCode()
 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.organizationCode;
 }

 {
  this.organizationCode = organizationCode;
 }

 {
     return this.filePk;
 }

 {
  this.filePk = filePk;
 }

 {
     return this.rootCode;
 }

 {
  this.rootCode = rootCode;
 }

 {
     return this.versionNo;
 }

 {
  this.versionNo = versionNo;
 }

 {
     return this.typeCode;
 }

 {
  this.typeCode = typeCode;
 }

 {
     return this.statusCode;
 }

 {
  this.statusCode = statusCode;
 }

 {
     return this.name;
 }

 {
  this.name = name;
 }

 {
     return this.description;
 }

 {
  this.description = description;
 }

 {
     return this.ownerTypeCode;
 }

 {
  this.ownerTypeCode = ownerTypeCode;
 }

 {
     return this.ownerCode;
 }

 {
  this.ownerCode = ownerCode;
 }

 {
     return this.organizationName;
 }

 {
  this.organizationName = organizationName;
 }

 {
     return this.typeName;
 }

 {
  this.typeName = typeName;
 }

 {
     return this.statusName;
 }

 {
  this.statusName = statusName;
 }

 {
     return this.ownerTypeName;
 }

 {
  this.ownerTypeName = ownerTypeName;
 }

 {
     return this.ownerName;
 }

 {
  this.ownerName = ownerName;
 }

 {
     return this.canDelete;
 }

 {
  this.canDelete = canDelete;
 }

 {
     return this.canUpgrade;
 }

 {
  this.canUpgrade = canUpgrade;
 }

 {
     return this.customCategoryCode;
 }

 {
  this.customCategoryCode = customCategoryCode;
 }

 {
     return this.canActivated;
 }

 {
  this.canActivated = canActivated;
 }

 {
     return this.canStop;
 }

 {
  this.canStop = canStop;
 }

 {
     return this.canReject;
 }

 {
  this.canReject = canReject;
 }

 {
     return this.customCategoryName;
 }

 {
  this.customCategoryName = customCategoryName;
 }

 {
     return this.canReview;
 }

 {
  this.canReview = canReview;
 }

 {
     return this.canSubmit;
 }

 {
  this.canSubmit = canSubmit;
 }

public String getOdtFile() {
	return odtFile;
}

public void setOdtFile(String odtFile) {
	this.odtFile = odtFile;
}

