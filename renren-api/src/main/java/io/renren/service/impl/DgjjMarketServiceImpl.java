/**
 * Copyright 2018 人人开源 http://www.renren.io
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.renren.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import io.renren.dao.DgjjMarketDao;
import io.renren.dto.DgjjMarketDetailDto;
import io.renren.dto.DgjjMarketDto;
import io.renren.entity.DgjjMarketEntity;
import io.renren.form.DgjjMarketForm;
import io.renren.service.DgjjMarketService;

@Service("dgjjMarketService")
public class DgjjMarketServiceImpl extends ServiceImpl<DgjjMarketDao, DgjjMarketEntity> implements DgjjMarketService {

	@Autowired
	DgjjMarketDao dgjjMarketDao;
	
	@Override
	public List<DgjjMarketDto> findList(DgjjMarketForm form) {
		return dgjjMarketDao.findList(form);
	}
	
	@Override
	public List<DgjjMarketDto> findMyList(DgjjMarketForm form) {
		return dgjjMarketDao.findMyList(form);
	}
	
	@Override
	public List<DgjjMarketDetailDto> findMyDetailList(DgjjMarketForm form) {
		return dgjjMarketDao.findMyDetailList(form);
	}
	
}
