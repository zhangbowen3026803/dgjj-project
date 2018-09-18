package io.renren.form;



import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 炒技术表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-06 14:02:08
 */
@ApiModel(value = "炒技术表单")
public class DgjjCookTechForm {

	/**
	 *  大盘ID
	 */
	@ApiModelProperty(value = "大盘ID")
	private String marketId;
	/**
	 * 驱动现额
	 */
	@ApiModelProperty(value = "驱动现额")
	private String driveCash;
	/**
	 * 用户ID
	 */
	@ApiModelProperty(value = "用户ID")
	private String userId;

	/**
	 * 设置： 大盘ID
	 */
	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	/**
	 * 获取： 大盘ID
	 */
	public String getMarketId() {
		return marketId;
	}
	/**
	 * 设置：驱动现额
	 */
	public void setDriveCash(String driveCash) {
		this.driveCash = driveCash;
	}
	/**
	 * 获取：驱动现额
	 */
	public String getDriveCash() {
		return driveCash;
	}
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
}
