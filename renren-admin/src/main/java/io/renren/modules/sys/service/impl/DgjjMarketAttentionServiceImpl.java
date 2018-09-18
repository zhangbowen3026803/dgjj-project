package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.DgjjMarketAttentionDao;
import io.renren.modules.sys.entity.DgjjMarketAttentionEntity;
import io.renren.modules.sys.service.DgjjMarketAttentionService;


@Service("dgjjMarketAttentionService")
public class DgjjMarketAttentionServiceImpl extends ServiceImpl<DgjjMarketAttentionDao, DgjjMarketAttentionEntity> implements DgjjMarketAttentionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DgjjMarketAttentionEntity> page = this.selectPage(
                new Query<DgjjMarketAttentionEntity>(params).getPage(),
                new EntityWrapper<DgjjMarketAttentionEntity>()
        );

        return new PageUtils(page);
    }

}
