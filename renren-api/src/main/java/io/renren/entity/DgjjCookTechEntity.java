package io.renren.entity;



import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 炒技术表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-06 14:02:08
 */
@TableName("dgjj_cook_tech")
public class DgjjCookTechEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Long id;
	/**
	 *  大盘ID
	 */
	private Long marketId;
	/**
	 * 驱动现额
	 */
	private String driveCash;
	/**
	 * 用户ID
	 */
	private Long userId;
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
	 * 设置： 大盘ID
	 */
	public void setMarketId(Long marketId) {
		this.marketId = marketId;
	}
	/**
	 * 获取： 大盘ID
	 */
	public Long getMarketId() {
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
