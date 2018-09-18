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

import io.renren.dao.DgjjDictDao;
import io.renren.dto.DgjjDictDto;
import io.renren.entity.SysDictEntity;
import io.renren.service.DgjjDictService;


@Service("sysDictService")
public class DgjjDictServiceImpl extends ServiceImpl<DgjjDictDao, SysDictEntity> implements DgjjDictService {

	@Autowired
	DgjjDictDao dgjjDictDao;
	
	@Override
	public List<DgjjDictDto> findList(String type) {
		return dgjjDictDao.findList(type);
	}
}
