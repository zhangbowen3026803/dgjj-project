package io.renren.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 报技术表
 * 
 * @author bowen.zhang
 * @date 2018-08-15 12:18:37
 */
@ApiModel(value = "报技术表单")
public class DgjjReportTechForm {

	/**
	 * 企业名称
	 */
	@ApiModelProperty(value = "企业名称")
	private String companyName;
	/**
	 * 经营领域
	 */
	@ApiModelProperty(value = "经营领域")
	private String operationScope;
	/**
	 * 技术名称
	 */
	@ApiModelProperty(value = "技术名称")
	private String techName;
	/**
	 * 技术所属领域
	 */
	@ApiModelProperty(value = "技术所属领域")
	private String techArea;
	/**
	 * 是否有专利
	 */
	@ApiModelProperty(value = "是否有专利")
	private String ifPatent;
	/**
	 * 联系人
	 */
	@ApiModelProperty(value = "联系人")
	private String contactPeople;
	/**
	 * 联系电话
	 */
	@ApiModelProperty(value = "联系电话")
	private String contactTel;
	/**
	 * 用户ID
	 */
	@ApiModelProperty(value = "用户ID")
	private String userId;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getOperationScope() {
		return operationScope;
	}
	public void setOperationScope(String operationScope) {
		this.operationScope = operationScope;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	public String getTechArea() {
		return techArea;
	}
	public void setTechArea(String techArea) {
		this.techArea = techArea;
	}
	public String getIfPatent() {
		return ifPatent;
	}
	public void setIfPatent(String ifPatent) {
		this.ifPatent = ifPatent;
	}
	public String getContactPeople() {
		return contactPeople;
	}
	public void setContactPeople(String contactPeople) {
		this.contactPeople = contactPeople;
	}
	public String getContactTel() {
		return contactTel;
	}
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
