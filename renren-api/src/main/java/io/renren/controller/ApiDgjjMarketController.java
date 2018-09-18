package io.renren.controller;

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
import io.renren.form.DgjjMarketForm;
import io.renren.service.DgjjMarketService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 大盘接口
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:31
 */
@RestController
@RequestMapping("/api")
@Api(tags = "大盘接口")
public class ApiDgjjMarketController {
	@Autowired
	private DgjjMarketService dgjjMarketService;

	@PostMapping("market")
	@ApiOperation("大盘查询")
	public R market(DgjjMarketForm form) {

		// 大盘查询
		Map<String, Object> map = new HashMap<>();
		try {
			List<DgjjMarketDto> list = dgjjMarketService.findList(form);

			map.put("list", list);

		} catch (Exception e) {
			return R.error();
		}

		return R.ok(map);
	}
	
	@PostMapping("market/detail")
	@ApiOperation("大盘详情")
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
	
}
