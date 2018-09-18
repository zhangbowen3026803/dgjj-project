package io.renren.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.Constants;
import io.renren.common.utils.R;
import io.renren.entity.DgjjDriveAuthenticationEntity;
import io.renren.entity.UserRoleEntity;
import io.renren.form.DgjjDriveAuthenticationForm;
import io.renren.service.DgjjDriveAuthenticationService;
import io.renren.service.UserRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 驱动会员认证接口
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:31
 */
@RestController
@RequestMapping("/api")
@Api(tags = "驱动会员认证接口")
public class ApiDgjjDriveAuthenticationController {
	
	@Autowired
	private DgjjDriveAuthenticationService dgjjDriveAuthenticationService;
	
	@Autowired
    private UserRoleService userRoleService;
	
	@PostMapping("drive/authentication")
	@ApiOperation("驱动会员认证录入")
	public R authentication(DgjjDriveAuthenticationForm form) {

		try {
			DgjjDriveAuthenticationEntity dt = new DgjjDriveAuthenticationEntity();
			dt.setIdNumber(form.getIdNumber());
			dt.setName(form.getName());
			dt.setUserId(Long.valueOf(form.getUserId()));
			dt.setBankNo(form.getBankNo());
			dt.setCreateTime(new Date());
			dgjjDriveAuthenticationService.insert(dt);
			
			UserRoleEntity role = new UserRoleEntity();
	        role.setRoleId(Long.valueOf(Constants.role.driving_members));
	        role.setUserId(Long.valueOf(form.getUserId()));
	        userRoleService.insert(role);
	        
		} catch (Exception e) {
			return R.error();
		}

		return R.ok();
	}
	
}
