$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/dgjjreporttech/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true,hidden: true },
			{ label: '企业名称', name: 'companyName', index: 'company_name', width: 80 }, 			
			{ label: '经营领域', name: 'operationScope', index: 'operation_scope', width: 80 }, 			
			{ label: '技术名称', name: 'techName', index: 'tech_name', width: 80 }, 			
			{ label: '技术所属领域', name: 'techArea', index: 'tech_area', width: 80 }, 			
			{ label: '是否有专利', name: 'ifPatent', index: 'if_patent', width: 80 }, 			
			{ label: '联系人', name: 'contactPeople', index: 'contact_people', width: 80 }, 			
			{ label: '联系电话', name: 'contactTel', index: 'contact_tel', width: 80 }, 			
			{ label: '用户ID', name: 'userId', index: 'user_id', width: 80,hidden: true }, 			
			{ label: '创建时间', name: 'createTime', index: 'create_time', width: 80 }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		dgjjReportTech: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.dgjjReportTech = {};
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
			var url = vm.dgjjReportTech.id == null ? "sys/dgjjreporttech/save" : "sys/dgjjreporttech/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.dgjjReportTech),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var ids = getSelectedRows();
			if(ids == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "sys/dgjjreporttech/delete",
                    contentType: "application/json",
				    data: JSON.stringify(ids),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(id){
			$.get(baseURL + "sys/dgjjreporttech/info/"+id, function(r){
                vm.dgjjReportTech = r.dgjjReportTech;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});