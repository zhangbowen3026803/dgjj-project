package io.renren.common.utils;

public class Constants {
	
	public static final String drive_money = "2000";
	
	public static enum Audit{
		
		IS_AUDIT("0","审核通过"),
		NOT_AUDIT("1","审核未通过");
		
		private Audit(String value,String name){
            this.value=value;
            this.name=name;
        }
        private final String value;
        private final String name;
        
        public String getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
	}
	
	public static enum Dict{
		
		tech_transformation("0","技术转让"),
		equity_financing("1","股权融资"),
		product_transition("2","产品转移"),
		franchisees("3","连锁加盟"),
		artificial_intelligence("A","A-人工智能"),
		chemicals_industry("B","B-精细化工"),
		advanced_equipment_manufacturing("C","先进装备制造"),
		clean_energy("D","清洁能源"),
		ship_ocean_engineering("E","船舶和海洋工程"),
		life_health("F","生命健康"),
		modern_agriculture("G","现代农业"),
		integrated_circuit("H","集成电路"),
		material("I","新材料"),
		traffic_equipment("J","交通装备"),
		energy_conservation_environment_protection("K","节能环保"),
		integration_culture_technology("L","文化与科技融合"),
		modern_service_industry("M","现代服务业"),
		civil_military_inosculation("N","军民融合");

        
        
        private Dict(String value,String name){
            this.value=value;
            this.name=name;
        }
        private final String value;
        private final String name;
        
        public String getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }
	
	public static enum ErrorCode{
		
		mobile_register("101","手机号已注册"),
		drive_money("102","用户注册数量已超过10000,不再赠与2000驱动额度"),
		investment("103","请与蓝马甲联系");
		
		private ErrorCode(String value,String name){
            this.value=value;
            this.name=name;
        }
        private final String value;
        private final String name;
        
        public String getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
		
	}
	
	public static class transferProgress{
		
		public static final String tech_transformation = "0";//技术转让
		
		public static final String equity_financing = "1";//股权融资 
		
		public static final String product_transition = "2";//产品转移
		
		public static final String franchisees = "3";//连锁加盟
		
	}
	
	public static class role{
		
		public static final String tourist = "3";//游客
		
		public static final String regular_members = "4";//普通会员
		
		public static final String driving_members = "5";//驱动会员
		
		public static final String institutional_investor = "6";//投资机构
		
	}
}
