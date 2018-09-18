package io.renren.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.Constants;
import io.renren.common.utils.R;
import io.renren.dto.DgjjMarketDetailDto;
import io.renren.dto.DgjjMarketDto;
import io.renren.entity.DgjjInvestmentTechEntity;
import io.renren.form.DgjjInvestmentTechForm;
import io.renren.form.DgjjMarketForm;
import io.renren.service.DgjjInvestmentTechService;
import io.renren.service.DgjjMarketService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 *  投技术接口
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:31
 */
@RestController
@RequestMapping("/api")
@Api(tags = "投技术接口")
public class ApiDgjjInvestmentTechnologyController {
	
	@Autowired
	private DgjjMarketService dgjjMarketService;
	
	@Autowired
	private DgjjInvestmentTechService dgjjInvestmentTechService;
	
	@PostMapping("investmenttech")
	@ApiOperation("投技术查询")
	public R investmenttech(DgjjMarketForm form) {

		// 投技术查询
		Map<String, Object> map = new HashMap<>();
		try {
			List<DgjjMarketDto> list = dgjjMarketService.findList(form);

			map.put("list", list);

		} catch (Exception e) {
			return R.error();
		}

		return R.ok(map);
	}
	
	@PostMapping("investmenttech/detail")
	@ApiOperation("投技术详情")
	public R investmenttechdetail(DgjjMarketForm form) {

		// 投技术查询
		Map<String, Object> map = new HashMap<>();
		try {
			List<DgjjMarketDetailDto> list = dgjjMarketService.findMyDetailList(form);

			map.put("list", list);

		} catch (Exception e) {
			return R.error();
		}

		return R.ok(map);
	}
	
	@PostMapping("my/investmenttech")
	@ApiOperation("我投的技术查询")
	public R mycooktech(DgjjMarketForm form) {

		// 投技术查询
		Map<String, Object> map = new HashMap<>();
		try {
			List<DgjjMarketDto> list = dgjjMarketService.findMyList(form);

			map.put("list", list);

		} catch (Exception e) {
			return R.error();
		}

		return R.ok(map);
	}
	
	@PostMapping("my/investmenttech/detail")
	@ApiOperation("我投的技术详情")
	public R mycooktechdetail(DgjjMarketForm form) {

		// 投技术查询
		Map<String, Object> map = new HashMap<>();
		try {
			List<DgjjMarketDetailDto> list = dgjjMarketService.findMyDetailList(form);

			map.put("list", list);

		} catch (Exception e) {
			return R.error();
		}

		return R.ok(map);
	}
	
	@PostMapping("investment")
	@ApiOperation("投资")
	public R investment(DgjjInvestmentTechForm form) {

		Map<String, Object> map = new HashMap<>();
		try {
			
			DgjjInvestmentTechEntity dt = new DgjjInvestmentTechEntity();
			dt.setMarketId(Long.valueOf(form.getMarketId()));
			dt.setUserId(Long.valueOf(form.getUserId()));
			dt.setCreateTime(new Date());
			dgjjInvestmentTechService.insert(dt);
			
			map.put("msgCode", Constants.ErrorCode.investment.getValue());
    		map.put("msginfo", Constants.ErrorCode.investment.getName());
    		
		} catch (Exception e) {
			return R.error();
		}

		return R.ok(map);
	}

}
