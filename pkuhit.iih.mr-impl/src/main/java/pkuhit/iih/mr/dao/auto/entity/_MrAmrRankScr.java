package pkuhit.iih.mr.dao.auto.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.35.0" }, date = "2017-01-01T01:49:38.338+0800")
public final class _MrAmrRankScr extends org.seasar.doma.jdbc.entity.AbstractEntityType<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.35.0");
    }

    private static final _MrAmrRankScr __singleton = new _MrAmrRankScr();

    /** the amrRankScrCd */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.String, java.lang.Object> $amrRankScrCd = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "amrRankScrCd", "AMR_RANK_SCR_CD");

    /** the amrRankCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.String, java.lang.Object> $amrRankCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "amrRankCd", "AMR_RANK_CD", true, true);

    /** the orgCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.String, java.lang.Object> $orgCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "orgCd", "ORG_CD", true, true);

    /** the maxScr */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.math.BigInteger, java.lang.Object> $maxScr = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.math.BigInteger, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr.class, java.math.BigInteger.class, org.seasar.doma.wrapper.BigIntegerWrapper.class, null, null, "maxScr", "MAX_SCR", true, true);

    /** the minScr */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.math.BigInteger, java.lang.Object> $minScr = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.math.BigInteger, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr.class, java.math.BigInteger.class, org.seasar.doma.wrapper.BigIntegerWrapper.class, null, null, "minScr", "MIN_SCR", true, true);

    /** the sortNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.String, java.lang.Object> $sortNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sortNo", "SORT_NO", true, true);

    /** the updCnt */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.math.BigInteger, java.lang.Object> $updCnt = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.math.BigInteger, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr.class, java.math.BigInteger.class, org.seasar.doma.wrapper.BigIntegerWrapper.class, null, null, "updCnt", "UPD_CNT", true, true);

    /** the crtTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.sql.Timestamp, java.lang.Object> $crtTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.sql.Timestamp, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "crtTime", "CRT_TIME", true, true);

    /** the crtUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.String, java.lang.Object> $crtUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "crtUserId", "CRT_USER_ID", true, true);

    /** the crtDeptCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.String, java.lang.Object> $crtDeptCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "crtDeptCd", "CRT_DEPT_CD", true, true);

    /** the lastUpdTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.sql.Timestamp, java.lang.Object> $lastUpdTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.sql.Timestamp, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "lastUpdTime", "LAST_UPD_TIME", true, true);

    /** the lastUpdDeptCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.String, java.lang.Object> $lastUpdDeptCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "lastUpdDeptCd", "LAST_UPD_DEPT_CD", true, true);

    /** the lastUpdUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.String, java.lang.Object> $lastUpdUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "lastUpdUserId", "LAST_UPD_USER_ID", true, true);

    /** the delF */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.Short, java.lang.Object> $delF = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, java.lang.Short, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr.class, java.lang.Short.class, org.seasar.doma.wrapper.ShortWrapper.class, null, null, "delF", "DEL_F", true, true);

    private final pkuhit.iih.mr.dao.auto.entity.MrAmrRankScrListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, ?>> __entityPropertyTypeMap;

    private _MrAmrRankScr() {
        __listener = new pkuhit.iih.mr.dao.auto.entity.MrAmrRankScrListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "MrAmrRankScr";
        __catalogName = "";
        __schemaName = "";
        __tableName = "MR_AMR_RANK_SCR";
        __qualifiedTableName = "MR_AMR_RANK_SCR";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, ?>>(14);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, ?>>(14);
        __idList.add($amrRankScrCd);
        __list.add($amrRankScrCd);
        __map.put("amrRankScrCd", $amrRankScrCd);
        __list.add($amrRankCd);
        __map.put("amrRankCd", $amrRankCd);
        __list.add($orgCd);
        __map.put("orgCd", $orgCd);
        __list.add($maxScr);
        __map.put("maxScr", $maxScr);
        __list.add($minScr);
        __map.put("minScr", $minScr);
        __list.add($sortNo);
        __map.put("sortNo", $sortNo);
        __list.add($updCnt);
        __map.put("updCnt", $updCnt);
        __list.add($crtTime);
        __map.put("crtTime", $crtTime);
        __list.add($crtUserId);
        __map.put("crtUserId", $crtUserId);
        __list.add($crtDeptCd);
        __map.put("crtDeptCd", $crtDeptCd);
        __list.add($lastUpdTime);
        __map.put("lastUpdTime", $lastUpdTime);
        __list.add($lastUpdDeptCd);
        __map.put("lastUpdDeptCd", $lastUpdDeptCd);
        __list.add($lastUpdUserId);
        __map.put("lastUpdUserId", $lastUpdUserId);
        __list.add($delF);
        __map.put("delF", $delF);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return __tableName;
    }

    @Override
    public String getQualifiedTableName() {
        return __qualifiedTableName;
    }

    @Override
    public void preInsert(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr entity, org.seasar.doma.jdbc.entity.PreInsertContext<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr entity, org.seasar.doma.jdbc.entity.PreUpdateContext<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr entity, org.seasar.doma.jdbc.entity.PreDeleteContext<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr entity, org.seasar.doma.jdbc.entity.PostInsertContext<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr entity, org.seasar.doma.jdbc.entity.PostUpdateContext<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr entity, org.seasar.doma.jdbc.entity.PostDeleteContext<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr newEntity() {
        return new pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr();
    }

    @Override
    public pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr newEntity(java.util.Map<String, Object> __args) {
        return new pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr();
    }

    @Override
    public Class<pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr> getEntityClass() {
        return pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr.class;
    }

    @Override
    public pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr getOriginalStates(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(pkuhit.iih.mr.dao.auto.entity.MrAmrRankScr __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MrAmrRankScr getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MrAmrRankScr newInstance() {
        return new _MrAmrRankScr();
    }

}
