package io.renren.modules.sys.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 技术大盘表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-03 15:13:42
 */
@TableName("dgjj_market")
public class DgjjMarketEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Long id;
	/**
	 *  审核进度
	 */
	private String techAudit;
	/**
	 * 技术编码
	 */
	private String techNo;
	/**
	 * 技术名称
	 */
	private String techName;
	/**
	 * 技术占股
	 */
	private String techShareStock;
	/**
	 * 技术估值
	 */
	private String techAppraise;
	/**
	 * 技术报价
	 */
	private String techQuotePrice;
	/**
	 * 市场指数
	 */
	private String marketIndex;
	/**
	 * 关键指数
	 */
	private String criticalityIndex;
	/**
	 * 收益总额
	 */
	private String totalIncome;
	/**
	 * 驱动人数
	 */
	private String driveNumber;
	/**
	 * 驱动现额
	 */
	private String driveCash;
	/**
	 * 领域额度
	 */
	private String collarDriveLimit;
	/**
	 * 单位收益
	 */
	private String unitIncome;
	/**
	 * 交易方式
	 */
	private String transferProgress;
	/**
	 * 技术领域
	 */
	private String techArea;
	/**
	 * 核心价值
	 */
	private String coreValue;
	/**
	 * 技术简介
	 */
	private String techProfile;
	/**
	 * 企业名称
	 */
	private String companyName;
	/**
	 * 经营领域
	 */
	private String operationScope;
	/**
	 * 是否有专利
	 */
	private String ifPatent;
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
	 * 设置： 审核进度
	 */
	public void setTechAudit(String techAudit) {
		this.techAudit = techAudit;
	}
	/**
	 * 获取： 审核进度
	 */
	public String getTechAudit() {
		return techAudit;
	}
	/**
	 * 设置：技术编码
	 */
	public void setTechNo(String techNo) {
		this.techNo = techNo;
	}
	/**
	 * 获取：技术编码
	 */
	public String getTechNo() {
		return techNo;
	}
	/**
	 * 设置：技术名称
	 */
	public void setTechName(String techName) {
		this.techName = techName;
	}
	/**
	 * 获取：技术名称
	 */
	public String getTechName() {
		return techName;
	}
	/**
	 * 设置：技术占股
	 */
	public void setTechShareStock(String techShareStock) {
		this.techShareStock = techShareStock;
	}
	/**
	 * 获取：技术占股
	 */
	public String getTechShareStock() {
		return techShareStock;
	}
	/**
	 * 设置：技术估值
	 */
	public void setTechAppraise(String techAppraise) {
		this.techAppraise = techAppraise;
	}
	/**
	 * 获取：技术估值
	 */
	public String getTechAppraise() {
		return techAppraise;
	}
	/**
	 * 设置：技术报价
	 */
	public void setTechQuotePrice(String techQuotePrice) {
		this.techQuotePrice = techQuotePrice;
	}
	/**
	 * 获取：技术报价
	 */
	public String getTechQuotePrice() {
		return techQuotePrice;
	}
	/**
	 * 设置：市场指数
	 */
	public void setMarketIndex(String marketIndex) {
		this.marketIndex = marketIndex;
	}
	/**
	 * 获取：市场指数
	 */
	public String getMarketIndex() {
		return marketIndex;
	}
	/**
	 * 设置：关键指数
	 */
	public void setCriticalityIndex(String criticalityIndex) {
		this.criticalityIndex = criticalityIndex;
	}
	/**
	 * 获取：关键指数
	 */
	public String getCriticalityIndex() {
		return criticalityIndex;
	}
	/**
	 * 设置：收益总额
	 */
	public void setTotalIncome(String totalIncome) {
		this.totalIncome = totalIncome;
	}
	/**
	 * 获取：收益总额
	 */
	public String getTotalIncome() {
		return totalIncome;
	}
	/**
	 * 设置：驱动人数
	 */
	public void setDriveNumber(String driveNumber) {
		this.driveNumber = driveNumber;
	}
	/**
	 * 获取：驱动人数
	 */
	public String getDriveNumber() {
		return driveNumber;
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
	 * 设置：领域额度
	 */
	public void setCollarDriveLimit(String collarDriveLimit) {
		this.collarDriveLimit = collarDriveLimit;
	}
	/**
	 * 获取：领域额度
	 */
	public String getCollarDriveLimit() {
		return collarDriveLimit;
	}
	/**
	 * 设置：单位收益
	 */
	public void setUnitIncome(String unitIncome) {
		this.unitIncome = unitIncome;
	}
	/**
	 * 获取：单位收益
	 */
	public String getUnitIncome() {
		return unitIncome;
	}
	/**
	 * 设置：交易方式
	 */
	public void setTransferProgress(String transferProgress) {
		this.transferProgress = transferProgress;
	}
	/**
	 * 获取：交易方式
	 */
	public String getTransferProgress() {
		return transferProgress;
	}
	/**
	 * 设置：技术领域
	 */
	public void setTechArea(String techArea) {
		this.techArea = techArea;
	}
	/**
	 * 获取：技术领域
	 */
	public String getTechArea() {
		return techArea;
	}
	/**
	 * 设置：核心价值
	 */
	public void setCoreValue(String coreValue) {
		this.coreValue = coreValue;
	}
	/**
	 * 获取：核心价值
	 */
	public String getCoreValue() {
		return coreValue;
	}
	/**
	 * 设置：技术简介
	 */
	public void setTechProfile(String techProfile) {
		this.techProfile = techProfile;
	}
	/**
	 * 获取：技术简介
	 */
	public String getTechProfile() {
		return techProfile;
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
	 * 设置：经营范围
	 */
	public void setOperationScope(String operationScope) {
		this.operationScope = operationScope;
	}
	/**
	 * 获取：经营范围
	 */
	public String getOperationScope() {
		return operationScope;
	}
	/**
	 * 设置：是否有专利
	 */
	public void setIfPatent(String ifPatent) {
		this.ifPatent = ifPatent;
	}
	/**
	 * 获取：是否有专利
	 */
	public String getIfPatent() {
		return ifPatent;
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
