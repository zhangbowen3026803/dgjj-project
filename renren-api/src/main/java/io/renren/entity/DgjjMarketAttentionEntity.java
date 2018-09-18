package io.renren.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 大盘关注表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-03 15:13:42
 */
@TableName("dgjj_market_attention")
public class DgjjMarketAttentionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 大盘ID
	 */
	private Long marketId;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
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
