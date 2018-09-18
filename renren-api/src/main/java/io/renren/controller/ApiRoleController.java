package io.renren.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.R;
import io.renren.entity.RoleEntity;
import io.renren.form.RoleForm;
import io.renren.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



/**
 * 角色
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-07 21:17:52
 */
@RestController
@RequestMapping("/api")
@Api(tags="我的角色接口")
public class ApiRoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping("role/add")
    @ApiOperation("角色新增")
    public R add(RoleForm form){
    	
    	RoleEntity role = new RoleEntity();
    	role.setRoleName(form.getRoleName());
    	role.setCreateTime(new Date());
    	roleService.insertOrUpdate(role);

        return R.ok();
    }

}
