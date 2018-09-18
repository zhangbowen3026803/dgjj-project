$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/dgjjmarket/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true ,hidden:true},
			{ label: '审核进度', name: 'techAudit', index: 'tech_audit', width: 50, formatter: function(value, options, row){
				return value === '0' ? 
						'<span class="label label-success">审核通过</span>' : 
						'<span class="label label-danger">审核未通过</span>';
				}}, 			
			{ label: '技术名称', name: 'techName', index: 'tech_name', width: 150 }, 			
			{ label: '技术报价', name: 'techQuotePrice', index: 'tech_quote_price', width: 50 ,hidden:true }, 	
			{ label: '技术估值', name: 'techAppraise', index: 'tech_appraise', width: 50 },
			{ label: '驱动人数', name: 'driveNumber', index: 'drive_number', width: 80 ,hidden:true }, 			
			{ label: '驱动现额', name: 'driveCash', index: 'drive_cash', width: 80 ,hidden:true }, 			
			{ label: '交易方式', name: 'transferProgress', index: 'transfer_progress', width: 80 , formatter: function(value, options, row){
					if(value == '0'){
						return "技术转让";
					}else if(value == '1'){
						return "股权融资";
					}else if(value == '2'){
						return "产品转移";
					}else if(value == '3'){
						return "连锁加盟";
					}else if(value == '4'){
						return " 海外并购";
					}else if(value == '5'){
						return "其它";
					}else{
						return "";
					}
				}},  			
			{ label: '技术领域', name: 'techArea', index: 'tech_area', width: 80 , formatter: function(value, options, row){
					if(value == 'A'){
						return "人工智能";
					}else if(value == 'B'){
						return "精细化工";
					}else if(value == 'C'){
						return "先进装备制造";
					}else if(value == 'D'){
						return "清洁能源";
					}else if(value == 'E'){
						return "船舶和海洋工程";
					}else if(value == 'F'){
						return "生命健康";
					}else if(value == 'G'){
						return "现代农业";
					}else if(value == 'H'){
						return "集成电路";
					}else if(value == 'I'){
						return "新材料";
					}else if(value == 'J'){
						return "交通装备";
					}else if(value == 'K'){
						return "节能环保";
					}else if(value == 'L'){
						return "文化与科技融合";
					}else if(value == 'M'){
						return "现代服务业";
					}else if(value == 'N'){
						return "军民融合";
					}else{
						return "";
					}
				}},  			
			{ label: '创建时间', name: 'createTime', index: 'create_time', width: 100 }			
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
		q:{
            techName: null
        },
		showList: true,
		title: null,
		dgjjMarket: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.dgjjMarket = {techAudit:"1",transferProgress:"0",techArea:"0",ifPatent:"0"};
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
			var url = vm.dgjjMarket.id == null ? "sys/dgjjmarket/save" : "sys/dgjjmarket/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.dgjjMarket),
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
				    url: baseURL + "sys/dgjjmarket/delete",
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
			$.get(baseURL + "sys/dgjjmarket/info/"+id, function(r){
                vm.dgjjMarket = r.dgjjMarket;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
				postData:{'techName': vm.q.techName},
                page:page
            }).trigger("reloadGrid");
		}
	}
});