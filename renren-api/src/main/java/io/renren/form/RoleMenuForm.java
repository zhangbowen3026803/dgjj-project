package io.renren.form;



import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 移动角色与菜单对应关系
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-07 21:17:51
 */
@ApiModel(value = "角色与菜单对应关系")
public class RoleMenuForm {

	/**
	 * 角色ID
	 */
	@ApiModelProperty(value = "角色ID")
	private Long roleId;
	/**
	 * 菜单ID
	 */
	@ApiModelProperty(value = "菜单ID")
	private Long menuId;

	/**
	 * 设置：角色ID
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	/**
	 * 获取：角色ID
	 */
	public Long getRoleId() {
		return roleId;
	}
	/**
	 * 设置：菜单ID
	 */
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	/**
	 * 获取：菜单ID
	 */
	public Long getMenuId() {
		return menuId;
	}
}
