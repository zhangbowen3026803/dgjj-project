package io.renren.entity;



import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 驱动人员额度收益表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-16 13:42:18
 */
@TableName("dgjj_member_drive_money")
public class DgjjMemberDriveMoneyEntity implements Serializable {
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
	 * 可驱动额度
	 */
	private String driveLimit;
	/**
	 * 已驱动收益
	 */
	private String drivenRevenue;
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
	 * 设置：可驱动额度
	 */
	public void setDriveLimit(String driveLimit) {
		this.driveLimit = driveLimit;
	}
	/**
	 * 获取：可驱动额度
	 */
	public String getDriveLimit() {
		return driveLimit;
	}
	/**
	 * 设置：已驱动收益
	 */
	public void setDrivenRevenue(String drivenRevenue) {
		this.drivenRevenue = drivenRevenue;
	}
	/**
	 * 获取：已驱动收益
	 */
	public String getDrivenRevenue() {
		return drivenRevenue;
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
