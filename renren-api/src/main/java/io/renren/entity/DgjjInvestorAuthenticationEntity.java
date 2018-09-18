package io.renren.entity;



import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 投资机构认证表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-14 15:30:05
 */
@TableName("dgjj_investor_authentication")
public class DgjjInvestorAuthenticationEntity implements Serializable {
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
	 * 企业名称
	 */
	private String companyName;
	/**
	 * 纳税人识别号
	 */
	private String taxNo;
	/**
	 * 联系人
	 */
	private String contactPeople;
	/**
	 * 联系电话
	 */
	private String contactTel;
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
	 * 设置：纳税人识别号
	 */
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	/**
	 * 获取：纳税人识别号
	 */
	public String getTaxNo() {
		return taxNo;
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
	 * 设置：联系电话
	 */
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	/**
	 * 获取：联系电话
	 */
	public String getContactTel() {
		return contactTel;
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
