package io.renren.controller;


import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.Constants;
import io.renren.common.utils.R;
import io.renren.common.validator.ValidatorUtils;
import io.renren.entity.UserEntity;
import io.renren.entity.UserRoleEntity;
import io.renren.form.RegisterForm;
import io.renren.form.UserForm;
import io.renren.service.UserRoleService;
import io.renren.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 我的基本信息接口
 * @author bowen.zhang
 * @date 2017-03-26 17:27
 */
@RestController
@RequestMapping("/api")
@Api(tags="我的基本信息接口")
public class ApiUserRoleController {
	
    @Autowired
    private UserService userService;
    
    @Autowired
    private UserRoleService userRoleService;

    @PostMapping("my/baseinfo")
    @ApiOperation("我的基本信息")
    public R baseinfo(RegisterForm form){
        //表单校验
        ValidatorUtils.validateEntity(form);

        UserEntity user = new UserEntity();
        user.setMobile(form.getMobile());
        user.setUsername(form.getUsername());
        user.setPassword(DigestUtils.sha256Hex(form.getPassword()));
        user.setCreateTime(new Date());
        user.setIfagree(form.getIfagree());
        userService.insert(user);
        
        UserRoleEntity role = new UserRoleEntity();
        role.setRoleId(Long.valueOf(Constants.role.regular_members));
        role.setUserId(user.getUserId());
        userRoleService.insert(role);
        
        return R.ok();
    }
    
    @PostMapping("my/baseinfo/updateUserName")
    @ApiOperation("我的基本信息用户名修改接口")
    public R updateUserName(UserForm form){
        //表单校验
        ValidatorUtils.validateEntity(form);

        UserEntity user = new UserEntity();
        user.setUserId(Long.valueOf(form.getUserId()));
        user.setUsername(form.getUsername());
        user.setCreateTime(new Date());
        userService.insertOrUpdate(user);
        
        return R.ok();
    }
}
