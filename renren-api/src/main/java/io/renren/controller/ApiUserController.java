package io.renren.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.R;
import io.renren.form.UserForm;
import io.renren.service.UserRoleService;
import io.renren.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 系统设置接口
 * @author bowen.zhang
 * @date 2017-03-26 17:27
 */
@RestController
@RequestMapping("/api")
@Api(tags="系统设置接口")
public class ApiUserController {
	
    @Autowired
    private UserService userService;
    
    @Autowired
    private UserRoleService userRoleService;

    @PostMapping("update/username")
    @ApiOperation("更新用户名")
    public R uusername(UserForm form){
        
        return R.ok();
    }
    
    @PostMapping("update/password")
    @ApiOperation("更改密码")
    public R upassword(UserForm form){
        
        return R.ok();
    }
}
