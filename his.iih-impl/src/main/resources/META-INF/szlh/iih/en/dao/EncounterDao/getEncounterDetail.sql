select 
EN_PK enPk ,
EN_NO enNo ,
SEX_CD sexCd,
SEX_NM sexNm,
AGE age,
AMR_NO amrNo,
SU_F suF,
PA_ID paId ,
PA_NM paNm ,
PA_INSUR_CD paInsurCd ,
PA_INSUR_NM paInsurNm ,
EN_CNT enCnt ,
EN_TP_CD enTpCd ,
EN_TP_NM enTpNm ,
EN_STA_CD enStaCd ,
EN_STA_NM enStaNm ,
NU_LVL_CD nuLvlCd ,
NU_LVL_NM nuLvlNm ,
ILL_STA_CD illStaCd ,
ILL_STA_NM illStaNm ,
REG_TIME regTime ,
RCV_TIME rcvTime ,
RCV_USER_ID rcvUserId ,
RCV_USER_NM rcvUserNm ,
RCV_DEPT_CD rcvDeptCd ,
RCV_DEPT_NM rcvDeptNm ,
CUR_MAIN_DI_CD curMainDiCd ,
CUR_MAIN_DI_NM curMainDiNm ,
CUR_DEPT_CD curDeptCd ,
CUR_DEPT_NM curDeptNm ,
CUR_DEPT_INTO_TIME curDeptIntoTime ,
CUR_WARD_CD curWardCd ,
CUR_WARD_NM curWardNm ,
CUR_WARD_INTO_TIME curWardIntoTime ,
CUR_GRP_CD curGrpCd ,
CUR_GRP_NM curGrpNm ,
CUR_BED_CD curBedCd ,
CUR_MNG_DCT_ID curMngDctId ,
CUR_MNG_DCT_NM curMngDctNm ,
CUR_MNG_NUR_ID curMngNurId ,
CUR_MNG_NUR_NM curMngNurNm ,
READM_F readmF ,
CALL_BACK_F callBackF ,
FLUP_VISIT_F flupVisitF ,
FNSH_TIME fnshTime ,
FNSH_USER_ID fnshUserId ,
FNSH_USER_NM fnshUserNm ,
FNSH_DEPT_CD fnshDeptCd ,
FNSH_DEPT_NM fnshDeptNm 
from VW_EN t 
where t.EN_PK =/*enPk*/838535 