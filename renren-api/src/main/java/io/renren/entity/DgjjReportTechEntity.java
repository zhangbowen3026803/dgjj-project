package io.renren.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 报技术表
 * 
 * @author bowen.zhang
 * @date 2018-08-15 12:18:37
 */
@TableName("dgjj_report_tech")
public class DgjjReportTechEntity implements Serializable {
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
	 * 技术名称
	 */
	private String techName;
	/**
	 * 所属技术领域
	 */
	private String techArea;
	/**
	 * 是否有专利
	 */
	private String ifPatent;
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
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getOperationScope() {
		return operationScope;
	}
	public void setOperationScope(String operationScope) {
		this.operationScope = operationScope;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	public String getTechArea() {
		return techArea;
	}
	public void setTechArea(String techArea) {
		this.techArea = techArea;
	}
	public String getIfPatent() {
		return ifPatent;
	}
	public void setIfPatent(String ifPatent) {
		this.ifPatent = ifPatent;
	}
	public String getContactPeople() {
		return contactPeople;
	}
	public void setContactPeople(String contactPeople) {
		this.contactPeople = contactPeople;
	}
	public String getContactTel() {
		return contactTel;
	}
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	
}
