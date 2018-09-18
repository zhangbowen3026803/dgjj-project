package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.DgjjSearchTechDao;
import io.renren.modules.sys.entity.DgjjSearchTechEntity;
import io.renren.modules.sys.service.DgjjSearchTechService;


@Service("dgjjSearchTechService")
public class DgjjSearchTechServiceImpl extends ServiceImpl<DgjjSearchTechDao, DgjjSearchTechEntity> implements DgjjSearchTechService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DgjjSearchTechEntity> page = this.selectPage(
                new Query<DgjjSearchTechEntity>(params).getPage(),
                new EntityWrapper<DgjjSearchTechEntity>()
        );

        return new PageUtils(page);
    }

}
