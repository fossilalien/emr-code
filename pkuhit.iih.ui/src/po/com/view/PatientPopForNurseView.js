Ext.define('iih.po.com.view.PatientPopForNurseView', {
    extend : 'Xap.ej.template.BaseTemplate',

    requires: ['iih.po.com.action.SyncPaToMrAmrAction'],

    alias:'widget.patientpopfornurseview',
    
    border: 0,
    
    layout: {
        type: 'vbox',
        align: 'stretch'
    },
    
    id: 'patientpopfornurseview',

    xapConfig: {
        blocks: {
            'search': {
                xclass: 'iih.po.com.block.SearchPatientForNurseBlock'
            },
            'content': {
                xclass: 'iih.po.com.block.PatientPopForNurseBlock'
            }
        },

        actions: {
            'init': {
                xclass: 'iih.po.com.action.PatientGridInitForNurseAction',
                url: 'mr/ens',
                blocks: {
                    search: 'search',
                    content: 'content'
                }
            },
            'selectPatient': {
                xclass: 'iih.po.com.action.SelectPatientAction',
                blocks: {
                    content: 'content'
                }
            },
            //wangyanli  add 当患者一览读取视图时，点击患者，如果数据库没有该条记录，需同步患者到MrAmr
            'syncPaToMrAmr': {
                xclass: 'iih.po.com.action.SyncPaToMrAmrAction',
                url: 'mr/amr/syncpatomramr',
                blocks: {
                    content: 'content'
                }
            }
        },

        chains: {
            'init': ['init'],
            'selectPatient': ['selectPatient'],
            'syncPaToMrAmr': ['syncPaToMrAmr']
        },

        connections: {
            'content': [{
                selector: 'xapgrid[groupType=1]',
                event: 'turnpage',
                chain: 'init'
            },{
                selector: 'xapgrid[groupType=2]',
                event: 'turnpage',
                chain: 'init'
            },{
                selector: 'xapgrid[groupType=3]',
                event: 'turnpage',
                chain: 'init'
            },{
                selector: 'xapgrid[groupType=6]',
                event: 'turnpage',
                chain: 'init'
            },{
                selector: 'xapgrid[groupType=7]',
                event: 'turnpage',
                chain: 'init'
            },{
                selector: 'xaptabpanel',
                event: 'tabchange',
                chain: 'init'
            }]
        }
    }
})