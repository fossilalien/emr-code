package iih.kr.db.cs.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "1.35.0" }, date = "2017-01-01T01:49:34.145+0800")
public class CusDiSuiteEntityDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements iih.kr.db.cs.dao.CusDiSuiteEntityDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.35.0");
    }

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public CusDiSuiteEntityDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<iih.kr.db.gen.entity.DiSuiteEntity> selectCategoryDiGTSort(java.lang.String orgCode, java.lang.String ownerType, java.lang.String ownerCode, java.lang.String categoryCode, int sortNo, java.lang.String isInclude) {
        entering("iih.kr.db.cs.dao.CusDiSuiteEntityDaoImpl", "selectCategoryDiGTSort", orgCode, ownerType, ownerCode, categoryCode, sortNo, isInclude);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/iih/kr/db/cs/dao/CusDiSuiteEntityDao/selectCategoryDiGTSort.sql");
            __query.addParameter("orgCode", java.lang.String.class, orgCode);
            __query.addParameter("ownerType", java.lang.String.class, ownerType);
            __query.addParameter("ownerCode", java.lang.String.class, ownerCode);
            __query.addParameter("categoryCode", java.lang.String.class, categoryCode);
            __query.addParameter("sortNo", int.class, sortNo);
            __query.addParameter("isInclude", java.lang.String.class, isInclude);
            __query.setCallerClassName("iih.kr.db.cs.dao.CusDiSuiteEntityDaoImpl");
            __query.setCallerMethodName("selectCategoryDiGTSort");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<iih.kr.db.gen.entity.DiSuiteEntity>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<iih.kr.db.gen.entity.DiSuiteEntity>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<iih.kr.db.gen.entity.DiSuiteEntity>(iih.kr.db.gen.entity._DiSuiteEntity.getSingletonInternal()));
            java.util.List<iih.kr.db.gen.entity.DiSuiteEntity> __result = __command.execute();
            __query.complete();
            exiting("iih.kr.db.cs.dao.CusDiSuiteEntityDaoImpl", "selectCategoryDiGTSort", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("iih.kr.db.cs.dao.CusDiSuiteEntityDaoImpl", "selectCategoryDiGTSort", __e);
            throw __e;
        }
    }

}
