Ext.define("iih.mr.model.mrTemplate",{
	extend: 'Ext.data.Model',
	fields:[
		{name:"mrTplVerKc",type:"string"},
		{name:"baseTplVerKc",type:"string"},
		{name:"orgCd",type:"string"},
        {name:"mrTplKc",type:"string"},
        {name:"verNo",type:"string"},
        {name:"mrTplStatCd",type:"string"},
        {name:"mrTplNm",type:"string"},
        {name:"mrTypeCd",type:"string"},
        {name:"pageTypeCd",type:"string"},
        {name:"ownerTypeCd",type:"string"},
        {name:"ownerCd",type:"string"},
        {name:"revwEmpId",type:"string"},
        {name:"revwDeptCd",type:"string"},
        {name:"revwTime",type:"string"},
        {name:"pubEmpId",type:"string"},
        {name:"pubDeptCd",type:"string"},
        {name:"pubTime",type:"string"},
        {name:"sortNo",type:"string"},
        {name:"descr",type:"string"},
        {name:"updCount",type:"string"},
        {name:"crtId",type:"string"},
        {name:"crtTime",type:"string"},
        {name:"lastUpdId",type:"string"},
        {name:"lastUpdTime",type:"string"},
        {name:"delF",type:"string"},
		'processTask'
	]
});
