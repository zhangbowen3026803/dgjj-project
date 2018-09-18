package io.renren.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.R;
import io.renren.entity.RoleMenuEntity;
import io.renren.form.RoleMenuForm;
import io.renren.service.RoleMenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



/**
 * 我的角色与菜单
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-07 21:17:52
 */
@RestController
@RequestMapping("/api")
@Api(tags="我的角色与菜单对应接口")
public class ApiRoleMenuController {
    @Autowired
    private RoleMenuService roleMenuService;

    @PostMapping("rolemenu/add")
    @ApiOperation("角色与菜单对应新增")
    public R add(RoleMenuForm form){
    	
    	RoleMenuEntity rolemenu = new RoleMenuEntity();
    	rolemenu.setRoleId(form.getRoleId());
    	rolemenu.setMenuId(form.getMenuId());
    	roleMenuService.insertOrUpdate(rolemenu);

        return R.ok();
    }

}
