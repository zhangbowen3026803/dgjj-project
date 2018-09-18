package io.renren.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.sys.entity.DgjjReportTechEntity;
import io.renren.modules.sys.service.DgjjReportTechService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 报技术表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-03 15:13:42
 */
@RestController
@RequestMapping("sys/dgjjreporttech")
public class DgjjReportTechController {
    @Autowired
    private DgjjReportTechService dgjjReportTechService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:dgjjreporttech:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = dgjjReportTechService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:dgjjreporttech:info")
    public R info(@PathVariable("id") String id){
        DgjjReportTechEntity dgjjReportTech = dgjjReportTechService.selectById(id);

        return R.ok().put("dgjjReportTech", dgjjReportTech);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:dgjjreporttech:save")
    public R save(@RequestBody DgjjReportTechEntity dgjjReportTech){
        dgjjReportTechService.insert(dgjjReportTech);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:dgjjreporttech:update")
    public R update(@RequestBody DgjjReportTechEntity dgjjReportTech){
        ValidatorUtils.validateEntity(dgjjReportTech);
        dgjjReportTechService.updateAllColumnById(dgjjReportTech);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:dgjjreporttech:delete")
    public R delete(@RequestBody String[] ids){
        dgjjReportTechService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
