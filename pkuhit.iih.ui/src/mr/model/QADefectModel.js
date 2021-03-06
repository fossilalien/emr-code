Ext.define('iih.mr.model.QADefectModel',{
	extend: 'Ext.data.Model',
	idProperty:'pk',
	fields: [
	         {name:'pk',type:"string"},
			 {name:'qaItemPk',type:"string"},
			 {name:'qaSystemItemCode',type:"string"},
			 {name:'qaPk',type:"string"},
			 {name:'targetObjectCode',type:"string"},
			 {name:'targetObjectPk',type:"string"},
			 {name:'targetObjectPk',type:"string"},
	         {name:'sourceObjectCode',type:"string"},
	         {name:'sourceObjectPk',type:"string"},
	         {name:'statusCode',type:"string"},
	         {name:'segmentTypeCode',type:"string"},
	         {name:'reformRequirement',type:"string"},
	         {name:'dropDescription',type:"string"},
	         {name:'canEdit',type:"string"},
	         {name:'canReform',type:"string"},
	         {name:'faultConfirmResult',type:"string"},
	         {name:'targetObjectName',type:"string"},
	         {name:'statusCode',type:"string"},
	         {name:'segmentTypeCode',type:"string"},
	         {name:'faultConfirmResult',type:"string"},
	         {name:'mrName',type:"string"},
	         {name:'qaSystemItemName',type:"string"},
	         {name:'statusName',type:"string"},
	         {name:'defectsDepict',type:"string"},
	         {name:'reformedDescription',type:"string"},
	         {name:'reformedTime',type:"number"},
	         {name:'reformedUserName',type:"string"},
	         {name:'reformedDeptName',type:"string"},
	         {name:'deadline',type:"number"},
	         {name:'defectsDepict',type:"string"},
	         {name:'submittedTime',type:"number"},
	         {name:'submittedUserName',type:"string"},
	         {name:'submittedDeptName',type:"string"},
	         {name:'saveFlag',type:"boolean",defaultValue:false}
	         ]
	 
});
