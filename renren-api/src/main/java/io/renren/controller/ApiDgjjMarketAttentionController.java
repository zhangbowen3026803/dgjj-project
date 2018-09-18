package io.renren.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.R;
import io.renren.entity.DgjjMarketAttentionEntity;
import io.renren.form.DgjjMarketAttentionForm;
import io.renren.service.DgjjMarketAttentionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 大盘技术关注接口
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:31
 */
@RestController
@RequestMapping("/api")
@Api(tags = "大盘技术关注接口")
public class ApiDgjjMarketAttentionController {
	
	@Autowired
	private DgjjMarketAttentionService dgjjMarketAttentionService;
	
	@PostMapping("attention")
	@ApiOperation("关注")
	public R attention(DgjjMarketAttentionForm form) {

		try {
			
			DgjjMarketAttentionEntity dt = new DgjjMarketAttentionEntity();
			dt.setMarketId(Long.valueOf(form.getMarketId()));
			dt.setUserId(Long.valueOf(form.getUserId()));
			dgjjMarketAttentionService.insert(dt);

		} catch (Exception e) {
			return R.error();
		}

		return R.ok();
	}
	
	@PostMapping("cancel/attention")
	@ApiOperation("取消关注")
	public R cancel(DgjjMarketAttentionForm form) {

		try {
			
			DgjjMarketAttentionEntity dt = new DgjjMarketAttentionEntity();
			dgjjMarketAttentionService.deleteById(dt.getMarketId());

		} catch (Exception e) {
			return R.error();
		}

		return R.ok();
	}

}
