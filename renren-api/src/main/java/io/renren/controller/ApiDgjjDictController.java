package io.renren.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.R;
import io.renren.dto.DgjjDictDto;
import io.renren.service.DgjjDictService;
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
@Api(tags = "字典接口")
public class ApiDgjjDictController {
	
	@Autowired
	private DgjjDictService dgjjDictService;
	
	@PostMapping("techarea")
	@ApiOperation("技术领域查询")
	public R techarea() {

		// 大盘查询
		Map<String, Object> map = new HashMap<>();
		try {
			String type = "tech_area";
			
			List<DgjjDictDto> list = dgjjDictService.findList(type);

			map.put("list", list);

		} catch (Exception e) {
			return R.error();
		}

		return R.ok(map);
	}
	
	@PostMapping("transaction")
	@ApiOperation("交易方式")
	public R transaction() {

		// 炒技术查询
		Map<String, Object> map = new HashMap<>();
		try {
			String type = "transfer_progress";
			
			List<DgjjDictDto> list = dgjjDictService.findList(type);

			map.put("list", list);

		} catch (Exception e) {
			return R.error();
		}

		return R.ok(map);
	}
	
}
