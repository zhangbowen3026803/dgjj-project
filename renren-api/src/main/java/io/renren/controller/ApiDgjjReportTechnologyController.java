package io.renren.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.Constants;
import io.renren.common.utils.R;
import io.renren.entity.DgjjMarketEntity;
import io.renren.entity.DgjjReportTechEntity;
import io.renren.form.DgjjReportTechForm;
import io.renren.service.DgjjMarketService;
import io.renren.service.DgjjReportTechnologyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 报技术接口
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:31
 */
@RestController
@RequestMapping("/api")
@Api(tags = "报技术接口")
public class ApiDgjjReportTechnologyController {
	
	@Autowired
	private DgjjReportTechnologyService dgjjReportTechnologyService;
	
	@Autowired
	private DgjjMarketService dgjjMarketService;

	@PostMapping("reporttech")
	@ApiOperation("报技术录入")
	public R reporttech(DgjjReportTechForm form) {

		try {
			DgjjReportTechEntity dt = new DgjjReportTechEntity();
			dt.setCompanyName(form.getCompanyName());
			dt.setOperationScope(form.getOperationScope());
			dt.setTechArea(form.getTechArea());
			dt.setTechName(form.getTechName());
			dt.setIfPatent(form.getIfPatent());
			dt.setContactPeople(form.getContactPeople());
			dt.setContactTel(form.getContactTel());
			dt.setCreateTime(new Date());
			dt.setUserId(form.getUserId());
			dgjjReportTechnologyService.insert(dt);
			
			DgjjMarketEntity dm = new DgjjMarketEntity();
			dm.setCompanyName(form.getCompanyName());
			dm.setOperationScope(form.getOperationScope());
			dm.setTechName(form.getTechName());
			dm.setTechAudit(Constants.Audit.NOT_AUDIT.getValue());
			dm.setIfPatent(form.getIfPatent());
			dm.setTechArea(form.getTechArea());
			dm.setCreateTime(new Date());
			dgjjMarketService.insert(dm);

		} catch (Exception e) {
			return R.error();
		}

		return R.ok();
	}
	
}
