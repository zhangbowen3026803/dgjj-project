package io.renren.entity;



import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 投技术表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-16 16:03:53
 */
@TableName("dgjj_investment_tech")
public class DgjjInvestmentTechEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
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
	 * 转移进度
	 */
	private String tranFlg;
	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 设置：主键
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键
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
	/**
	 * 设置：转移进度
	 */
	public void setTranFlg(String tranFlg) {
		this.tranFlg = tranFlg;
	}
	/**
	 * 获取：转移进度
	 */
	public String getTranFlg() {
		return tranFlg;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
}
