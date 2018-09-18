package io.renren.form;



import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 移动菜单管理
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-07 21:17:51
 */
@ApiModel(value = "菜单增加表单")
public class MenuForm {

	/**
	 * 菜单名称
	 */
	@ApiModelProperty(value = "菜单名称")
	private String name;
	/**
	 * 菜单URL
	 */
	@ApiModelProperty(value = "菜单URL")
	private String url;
	/**
	 * 排序
	 */
	@ApiModelProperty(value = "排序")
	private Integer orderNum;

	/**
	 * 设置：菜单名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：菜单名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：菜单URL
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：菜单URL
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：排序
	 */
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	/**
	 * 获取：排序
	 */
	public Integer getOrderNum() {
		return orderNum;
	}
}
