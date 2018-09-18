package io.renren.form;



import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 驱动会员认证表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-14 15:30:06
 */
@ApiModel(value = "驱动会员认证表单")
public class DgjjDriveAuthenticationForm {

	/**
	 * 用户ID
	 */
	@ApiModelProperty(value = "用户ID")
	private String userId;
	/**
	 * 姓名
	 */
	@ApiModelProperty(value = "姓名")
	private String name;
	/**
	 * 身份证号
	 */
	@ApiModelProperty(value = "身份证号")
	private String idNumber;
	/**
	 * 银行卡号
	 */
	@ApiModelProperty(value = "银行卡号")
	private String bankNo;

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
	 * 设置：姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：姓名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：身份证号
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	/**
	 * 获取：身份证号
	 */
	public String getIdNumber() {
		return idNumber;
	}
	/**
	 * 设置：银行卡号
	 */
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	/**
	 * 获取：银行卡号
	 */
	public String getBankNo() {
		return bankNo;
	}
	
}
