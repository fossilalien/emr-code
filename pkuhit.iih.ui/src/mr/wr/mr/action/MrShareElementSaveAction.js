Ext.define('iih.mr.wr.mr.action.MrShareElementSaveAction', {
    extend: 'Xap.ej.action.ServiceInvocation',
    
    /*
    * @Override
    */
    doExecute: function(context) {
        this.callParent();
        var operations = context.operations;
        var block = this.getBlock('content');
        var data = block.getData();
        var code = data.mrShareElementCd;
        var method = 'POST';
        if(code)
            method = 'PUT';
        var url = this.url;
        var METHODS = this.getInvocationMethods();
        var operation = {
            url: url,
            mclass: null,
            method: method,
            condition: null,
            data:data,
            scope: this,
            success: this.onSuccess
        };
        operations.push(operation);
    },
    
    onSuccess: function(operation) {
        var view = this.getOwner();
        var win = view.up('window');
        var parent = Ext.getCmp('mrshareelementid');
        var fn = function(){
            win.close();
            if(parent){
                var chain = parent.getActionChain('search');
                chain.execute();
            }
        };
        if(Ext.isObject(operation.data) && win){
            XapMessageBox.info(FuiLocale.get('messagebox', 'savedSuccess'),fn,win);
        }
    }
});