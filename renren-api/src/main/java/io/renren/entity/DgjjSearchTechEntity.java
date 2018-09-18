package io.renren.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 寻技术表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-03 15:13:42
 */
@TableName("dgjj_search_tech")
public class DgjjSearchTechEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Long id;
	/**
	 * 企业名称
	 */
	private String companyName;
	/**
	 * 经营领域
	 */
	private String operationScope;
	/**
	 * 需求技术要素
	 */
	private String techElement;
	/**
	 * 联系人
	 */
	private String contactPeople;
	/**
	 * 联系人电话
	 */
	private String contactTel;
	/**
	 * 用户ID
	 */
	private String userId;
	/**
	 * 创建时间
	 */
	private Date createTime;

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
	 * 设置：经营领域
	 */
	public void setOperationScope(String operationScope) {
		this.operationScope = operationScope;
	}
	/**
	 * 获取：经营领域
	 */
	public String getOperationScope() {
		return operationScope;
	}
	/**
	 * 设置：需求技术要素
	 */
	public void setTechElement(String techElement) {
		this.techElement = techElement;
	}
	/**
	 * 获取：需求技术要素
	 */
	public String getTechElement() {
		return techElement;
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
	 * 设置：联系人电话
	 */
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	/**
	 * 获取：联系人电话
	 */
	public String getContactTel() {
		return contactTel;
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
