package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.DgjjReportTechEntity;

import java.util.Map;

/**
 * 报技术表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-03 15:13:42
 */
public interface DgjjReportTechService extends IService<DgjjReportTechEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

