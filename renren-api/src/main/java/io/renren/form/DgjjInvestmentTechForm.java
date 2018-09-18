package io.renren.form;

/**
 * 投技术表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-16 16:03:53
 */
public class DgjjInvestmentTechForm {

	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 大盘ID
	 */
	private Long marketId;

	/**
	 * 设置：用户ID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户ID
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：大盘ID
	 */
	public void setMarketId(Long marketId) {
		this.marketId = marketId;
	}
	/**
	 * 获取：大盘ID
	 */
	public Long getMarketId() {
		return marketId;
	}
}
