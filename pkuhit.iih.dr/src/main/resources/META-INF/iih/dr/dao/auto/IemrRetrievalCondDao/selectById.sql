select
  COND_CD,
  RETRIEVAL_CD,
  COND_NAME,
  REL_TYPE,
  COND_TYPE,
  OBJ_CODE,
  OBJ_NAME,
  LOGIC,
  VAL_NAME,
  VAL_CODE,
  GRADE,
  UPCOND,
  FULL_PATH,
  DES,
  COND_NO,
  MEMO,
  SORT_NO,
  SPELL_NO,
  WUBI_NO,
  UPD_CNT,
  CRT_TIME,
  CRT_USER_ID,
  CRT_DEPT_CD,
  LAST_UPD_TIME,
  LAST_UPD_DEPT_CD,
  LAST_UPD_USER_ID,
  DEL_F
from
  IEMR_RETRIEVAL_COND
where
  COND_CD = /* condCd */'a'
and del_f = 0
