package io.renren.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.R;
import io.renren.entity.DgjjSearchTechEntity;
import io.renren.form.DgjjSearchTechForm;
import io.renren.service.DgjjSearchTechService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 报需求接口
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:31
 */
@RestController
@RequestMapping("/api")
@Api(tags = "报需求接口")
public class ApiDgjjSearchTechnologyController {
	
	@Autowired
	private DgjjSearchTechService dgjjSearchTechService;

	@PostMapping("searchtech")
	@ApiOperation("报需求录入")
	public R searchtech(DgjjSearchTechForm form) {

		try {
			DgjjSearchTechEntity dt = new DgjjSearchTechEntity();
			dt.setCompanyName(form.getCompanyName());
			dt.setOperationScope(form.getOperationScope());
			dt.setTechElement(form.getTechElement());
			dt.setContactPeople(form.getContactPeople());
			dt.setContactTel(form.getContactTel());
			dt.setCreateTime(new Date());
			dt.setUserId(form.getUserId());
			dgjjSearchTechService.insert(dt);

		} catch (Exception e) {
			return R.error();
		}

		return R.ok();
	}
	
}
