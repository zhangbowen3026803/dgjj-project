package io.renren.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 报需求表
 * 
 * @author bowen.zhang
 * @date 2018-08-15 12:18:37
 */
@ApiModel(value = "报需求表单")
public class DgjjSearchTechForm {

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
	 * 需求技术要素
	 */
	@ApiModelProperty(value = "需求技术要素")
	private String techElement;
	/**
	 * 联系人
	 */
	@ApiModelProperty(value = "联系人")
	private String contactPeople;
	/**
	 * 联系人电话
	 */
	@ApiModelProperty(value = "联系人电话")
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
	public String getTechElement() {
		return techElement;
	}
	public void setTechElement(String techElement) {
		this.techElement = techElement;
	}

}
