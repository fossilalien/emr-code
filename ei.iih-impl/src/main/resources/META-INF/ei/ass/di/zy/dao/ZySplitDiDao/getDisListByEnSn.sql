select 
DI_PK	diPk,
PA_ID	paId,
EN_CNT	enCnt,
PA_NM	paNm,
EN_PK	enPk,
PAR_DI_PK	parDiPk,
DI_CD	diCd,
DI_NM	diNm,
ICD_CD	icdCd,
ADD_INFO	addInfo,
MAIN_F	mainF,
UNC_F	uncF,
UNK_F	unkF,
STOP_F	stopF,
ADM_MR_DI_F	admMrDiF,
DI_TIME	diTime,
DI_USER_ID	diUserId,
DI_USER_NM	diUserNm,
DI_DEPT_CD	diDeptCd,
DI_DEPT_NM	diDeptNm,
LVL1_SORT_NO	lvl1SortNo,
LVL2_SORT_NO	lvl2SortNo,
TRT_RST_CD	trtRstCd,
TRT_RST_NM	trtRstNm,
DI_TP_CD	diTpCd,
DI_TP_NM	diTpNm
from VW_DI_ZY t
where 
1=1 
/*%if patientId != null */
 and t.PA_ID = /*patientId*/870719  
/*%end */
 /*%if times != null */
 and t.EN_CNT = /*times*/4  
/*%end */
/*%if isMainF != null */
 and t.MAIN_F = /*isMainF*/1 
/*%end */
 /*%if onlyNotStop != null */
 and t.STOP_F = /*onlyNotStop*/1 
/*%end */
  order by mainF desc,LVL1_SORT_NO,LVL2_SORT_NO ,diPk 