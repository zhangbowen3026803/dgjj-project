package io.renren.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

import io.renren.dto.DgjjMarketDetailDto;
import io.renren.dto.DgjjMarketDto;
import io.renren.entity.DgjjMarketEntity;
import io.renren.form.DgjjMarketForm;
/**
 * 用户
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:22:06
 */
public interface DgjjMarketService extends IService<DgjjMarketEntity> {

	List<DgjjMarketDto> findList(DgjjMarketForm form);
	
	List<DgjjMarketDto> findMyList(DgjjMarketForm form);
	
	List<DgjjMarketDetailDto> findMyDetailList(DgjjMarketForm form);
	
}
