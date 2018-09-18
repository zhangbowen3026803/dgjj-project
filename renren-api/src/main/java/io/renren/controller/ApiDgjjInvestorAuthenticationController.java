package io.renren.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.Constants;
import io.renren.common.utils.R;
import io.renren.entity.DgjjInvestorAuthenticationEntity;
import io.renren.entity.UserRoleEntity;
import io.renren.form.DgjjInvestorAuthenticationForm;
import io.renren.service.DgjjInvestorAuthenticationService;
import io.renren.service.UserRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 投资机构认证接口
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:31
 */
@RestController
@RequestMapping("/api")
@Api(tags = "投资机构认证接口")
public class ApiDgjjInvestorAuthenticationController {
	
	@Autowired
	private DgjjInvestorAuthenticationService dgjjInvestorAuthenticationService;
	
	@Autowired
    private UserRoleService userRoleService;

	@PostMapping("investor/authentication")
	@ApiOperation("投资机构认证录入")
	public R investor(DgjjInvestorAuthenticationForm form) {

		try {
			DgjjInvestorAuthenticationEntity dt = new DgjjInvestorAuthenticationEntity();
			dt.setCompanyName(form.getCompanyName());
			dt.setTaxNo(form.getTaxNo());
			dt.setUserId(Long.valueOf(form.getUserId()));
			dt.setContactPeople(form.getContactPeople());
			dt.setContactTel(form.getContactTel());
			dt.setCreateTime(new Date());
			dgjjInvestorAuthenticationService.insert(dt);
			
			UserRoleEntity role = new UserRoleEntity();
	        role.setRoleId(Long.valueOf(Constants.role.institutional_investor));
	        role.setUserId(Long.valueOf(form.getUserId()));
	        userRoleService.insert(role);

		} catch (Exception e) {
			return R.error();
		}

		return R.ok();
	}
	
}
