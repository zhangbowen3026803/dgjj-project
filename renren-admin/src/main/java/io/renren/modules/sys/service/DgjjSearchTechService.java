package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.DgjjSearchTechEntity;

import java.util.Map;

/**
 * 寻技术表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-03 15:13:42
 */
public interface DgjjSearchTechService extends IService<DgjjSearchTechEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

