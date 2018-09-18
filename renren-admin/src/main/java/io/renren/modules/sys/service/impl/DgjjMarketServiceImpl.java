package io.renren.modules.sys.service.impl;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.modules.sys.dao.DgjjMarketDao;
import io.renren.modules.sys.entity.DgjjMarketEntity;
import io.renren.modules.sys.service.DgjjMarketService;


@Service("dgjjMarketService")
public class DgjjMarketServiceImpl extends ServiceImpl<DgjjMarketDao, DgjjMarketEntity> implements DgjjMarketService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
    	String techName = (String)params.get("techName");
        Page<DgjjMarketEntity> page = this.selectPage(
                new Query<DgjjMarketEntity>(params).getPage(),
                new EntityWrapper<DgjjMarketEntity>()
                .like(StringUtils.isNotBlank(techName),"tech_name", techName)
				.orderBy("createTime",false)
        );

        return new PageUtils(page);
    }

}
