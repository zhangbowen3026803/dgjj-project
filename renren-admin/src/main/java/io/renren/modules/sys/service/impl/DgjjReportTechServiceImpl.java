package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.DgjjReportTechDao;
import io.renren.modules.sys.entity.DgjjReportTechEntity;
import io.renren.modules.sys.service.DgjjReportTechService;


@Service("dgjjReportTechService")
public class DgjjReportTechServiceImpl extends ServiceImpl<DgjjReportTechDao, DgjjReportTechEntity> implements DgjjReportTechService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DgjjReportTechEntity> page = this.selectPage(
                new Query<DgjjReportTechEntity>(params).getPage(),
                new EntityWrapper<DgjjReportTechEntity>()
        );

        return new PageUtils(page);
    }

}
