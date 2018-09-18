package io.renren.controller;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.Constants;
import io.renren.common.utils.R;
import io.renren.common.validator.ValidatorUtils;
import io.renren.entity.DgjjMemberDriveMoneyEntity;
import io.renren.entity.UserEntity;
import io.renren.entity.UserRoleEntity;
import io.renren.form.RegisterForm;
import io.renren.service.UserRoleService;
import io.renren.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 注册接口
 * @author bowen.zhang
 * @date 2017-03-26 17:27
 */
@RestController
@RequestMapping("/api")
@Api(tags="注册接口")
public class ApiRegisterController {
	
    @Autowired
    private UserService userService;
    
    @Autowired
    private UserRoleService userRoleService;

    @PostMapping("register")
    @ApiOperation("注册")
    public R register(RegisterForm form){
        //表单校验
        ValidatorUtils.validateEntity(form);
        Map<String, Object> map = new HashMap<>();
        try {
        	UserEntity us = userService.queryByMobile(form.getMobile());
        	if(us!=null) {
        		map.put("msgCode", Constants.ErrorCode.mobile_register.getValue());
        		map.put("msginfo", Constants.ErrorCode.mobile_register.getName());
        	}else {
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
		        if(user.getUserId() <= 10000) {
			        DgjjMemberDriveMoneyEntity md = new DgjjMemberDriveMoneyEntity();
			        md.setUserId(user.getUserId());
			        md.setDriveLimit(Constants.drive_money);
			        md.setCreateTime(new Date());
		        }else {
		        	map.put("msgCode", Constants.ErrorCode.drive_money.getValue());
	        		map.put("msginfo", Constants.ErrorCode.drive_money.getName());
		        }
		        map.put("userId", user.getUserId().toString());
        	}
	        return R.ok(map);
		}catch(Exception e) {
			return R.error();
		}
    }
}
