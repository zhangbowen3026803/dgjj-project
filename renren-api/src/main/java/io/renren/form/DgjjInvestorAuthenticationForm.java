package io.renren.form;



import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 投资机构认证表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-14 15:30:05
 */
@ApiModel(value = "投资机构认证表单")
public class DgjjInvestorAuthenticationForm {

	/**
	 * 用户ID
	 */
	@ApiModelProperty(value = "用户ID")
	private String userId;
	/**
	 * 企业名称
	 */
	@ApiModelProperty(value = "企业名称")
	private String companyName;
	/**
	 * 纳税人识别号
	 */
	@ApiModelProperty(value = "纳税人识别号")
	private String taxNo;
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
	 * 设置：用户ID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户ID
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：企业名称
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * 获取：企业名称
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * 设置：纳税人识别号
	 */
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	/**
	 * 获取：纳税人识别号
	 */
	public String getTaxNo() {
		return taxNo;
	}
	/**
	 * 设置：联系人
	 */
	public void setContactPeople(String contactPeople) {
		this.contactPeople = contactPeople;
	}
	/**
	 * 获取：联系人
	 */
	public String getContactPeople() {
		return contactPeople;
	}
	/**
	 * 设置：联系电话
	 */
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	/**
	 * 获取：联系电话
	 */
	public String getContactTel() {
		return contactTel;
	}
	
}
