//表格渲染
var gTable;
$(function () {
    []
    gTable=Table.create($('.table-sort'),{
        ajax:{
            type:'GET',
            url:'/manage/list/adminList'
        },
        pageLength:20,
//        searching: false,
        ajaxData:function (data) {

        },

        "rowCallback": function (row, data) {
            $(row).addClass('text-c');
            var rowInput = '<input id="input'+data['adminId']+'" type="checkbox" class="adminSelect"/>';
            var enableStatus='<td class="td-manage">' +
                '<a style="text-decoration:none" onClick="admin_start(this,'+data['adminId']+')" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe615;</i></a> ' +
                '<a title="编辑" href="javascript:;" onclick="admin_edit(\'管理员编辑\',\'admin-add.html\','+data['adminId']+',\'800\',\'500\')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> ' +
                '<a title="删除" href="javascript:;" onclick="admin_del(this,'+data['adminId']+')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>' +
                '</td>';
            var disableStatus='<td class="td-manage">' +
                '<a style="text-decoration:none" onClick="admin_stop(this,'+data['adminId']+')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a> ' +
                '<a title="编辑" href="javascript:;" onclick="admin_edit(\'管理员编辑\',\'admin-add.html\','+data['adminId']+',\'800\',\'500\')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> ' +
                '<a title="删除" href="javascript:;" onclick="admin_del(this,'+data['adminId']+')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>' +
                '</td>';
            $('.cell-inputCheckbox',row).html(rowInput);
            if(data['adminStatus']==0){
                $('.cell-adminStatus',row).html('<td class="td-status"><span class="label label-success radius">已启用</span></td>');
                $('.cell-adminOption',row).html(disableStatus);

            }else {
                $('.cell-adminStatus',row).html('<td class="td-status"><span class="label radius">已禁用</span></td>');
                $('.cell-adminOption',row).html(enableStatus);
            }

        },
//        ,
//
//        "initComplete": function () {
//
//        },
//
        "drawCallback": function (settings) {
            $("#selectAll").click(function(){
                var val = $(this).val();
                console.log($(this).prop('checked'));
                $("#adminListTable").find(".adminSelect").prop(val);

            })
        }

    });

});