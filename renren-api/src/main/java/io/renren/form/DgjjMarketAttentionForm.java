package io.renren.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 大盘关注表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-03 15:13:42
 */
@ApiModel(value = "大盘关注表单")
public class DgjjMarketAttentionForm {
	
	/**
	 * 关注ID
	 */
	@ApiModelProperty(value = "关注ID")
	private String attentionId;
	/**
	 * 用户ID
	 */
	@ApiModelProperty(value = "用户ID")
	private String userId;
	/**
	 * 大盘ID
	 */
	@ApiModelProperty(value = "大盘ID")
	private String marketId;

	/**
	 * 设置：关注ID
	 */
	public void setAttentionId(String attentionId) {
		this.attentionId = attentionId;
	}
	/**
	 * 获取：关注ID
	 */
	public String getAttentionId() {
		return attentionId;
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
	/**
	 * 设置：大盘ID
	 */
	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	/**
	 * 获取：大盘ID
	 */
	public String getMarketId() {
		return marketId;
	}
}
