package io.renren.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.R;
import io.renren.dto.DgjjMarketDetailDto;
import io.renren.dto.DgjjMarketDto;
import io.renren.entity.DgjjCookTechEntity;
import io.renren.form.DgjjCookTechForm;
import io.renren.form.DgjjMarketForm;
import io.renren.service.DgjjCookTechService;
import io.renren.service.DgjjMarketService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 *  炒技术接口
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:31
 */
@RestController
@RequestMapping("/api")
@Api(tags = "炒技术接口")
public class ApiDgjjCookTechnologyController {
	@Autowired
	private DgjjMarketService dgjjMarketService;
	
	@Autowired
	private DgjjCookTechService dgjjCookTechService;

	@PostMapping("cooktech")
	@ApiOperation("炒技术查询")
	public R cooktech(DgjjMarketForm form) {

		// 炒技术查询
		Map<String, Object> map = new HashMap<>();
		try {
			List<DgjjMarketDto> list = dgjjMarketService.findList(form);

			map.put("list", list);

		} catch (Exception e) {
			return R.error();
		}

		return R.ok(map);
	}
	
	@PostMapping("cooktech/detail")
	@ApiOperation("炒技术详情")
	public R cooktechdetail(DgjjMarketForm form) {

		// 炒技术查询
		Map<String, Object> map = new HashMap<>();
		try {
			List<DgjjMarketDetailDto> list = dgjjMarketService.findMyDetailList(form);

			map.put("list", list);

		} catch (Exception e) {
			return R.error();
		}

		return R.ok(map);
	}
	
	@PostMapping("my/cooktech")
	@ApiOperation("我炒的技术查询")
	public R mycooktech(DgjjMarketForm form) {

		// 炒技术查询
		Map<String, Object> map = new HashMap<>();
		try {
			List<DgjjMarketDto> list = dgjjMarketService.findMyList(form);

			map.put("list", list);

		} catch (Exception e) {
			return R.error();
		}

		return R.ok(map);
	}
	
	@PostMapping("my/cooktech/detail")
	@ApiOperation("我炒的技术详情")
	public R mycooktechdetail(DgjjMarketForm form) {

		// 炒技术查询
		Map<String, Object> map = new HashMap<>();
		try {
			List<DgjjMarketDetailDto> list = dgjjMarketService.findMyDetailList(form);

			map.put("list", list);

		} catch (Exception e) {
			return R.error();
		}

		return R.ok(map);
	}
	
	@PostMapping("drive")
	@ApiOperation("为他驱动")
	public R drive(DgjjCookTechForm form) {

		try {
			DgjjCookTechEntity dt = new DgjjCookTechEntity();
			dt.setDriveCash(form.getDriveCash());
			dt.setMarketId(Long.valueOf(form.getMarketId()));
			dt.setUserId(Long.valueOf(form.getUserId()));
			dt.setCreateTime(new Date());
			dgjjCookTechService.insert(dt);
			

		} catch (Exception e) {
			return R.error();
		}

		return R.ok();
	}

}
