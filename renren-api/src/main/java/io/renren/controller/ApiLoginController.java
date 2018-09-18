package io.renren.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.R;
import io.renren.common.validator.ValidatorUtils;
import io.renren.form.LoginForm;
import io.renren.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 登录接口
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:31
 */
@RestController
@RequestMapping("/api")
@Api(tags="登录接口")
public class ApiLoginController {
	
    @Autowired
    private UserService userService;


    @PostMapping("login")
    @ApiOperation("登录")
    public R login(LoginForm form){
    	
    	try {
	        //表单校验
	        ValidatorUtils.validateEntity(form);
	
	        //用户登录
	        Map<String, Object> map = userService.login(form);
	
	        return R.ok(map);
    	} catch (Exception e) {
			return R.error();
		}

    }

    @PostMapping("logout")
    @ApiOperation("退出")
    public R logout(@RequestParam(value="userId",required=true) String userId){
        //tokenService.expireToken(Long.valueOf(userId));
        return R.ok();
    }

}
