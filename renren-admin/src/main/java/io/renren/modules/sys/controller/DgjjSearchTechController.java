package io.renren.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.common.validator.ValidatorUtils;
import io.renren.modules.sys.entity.DgjjSearchTechEntity;
import io.renren.modules.sys.service.DgjjSearchTechService;



/**
 * 寻技术表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-03 15:13:42
 */
@RestController
@RequestMapping("sys/dgjjsearchtech")
public class DgjjSearchTechController {
    @Autowired
    private DgjjSearchTechService dgjjSearchTechService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:dgjjsearchtech:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = dgjjSearchTechService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:dgjjsearchtech:info")
    public R info(@PathVariable("id") String id){
        DgjjSearchTechEntity dgjjSearchTech = dgjjSearchTechService.selectById(id);

        return R.ok().put("dgjjSearchTech", dgjjSearchTech);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:dgjjsearchtech:save")
    public R save(@RequestBody DgjjSearchTechEntity dgjjSearchTech){
        dgjjSearchTechService.insert(dgjjSearchTech);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:dgjjsearchtech:update")
    public R update(@RequestBody DgjjSearchTechEntity dgjjSearchTech){
        ValidatorUtils.validateEntity(dgjjSearchTech);
        dgjjSearchTechService.updateAllColumnById(dgjjSearchTech);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:dgjjsearchtech:delete")
    public R delete(@RequestBody String[] ids){
        dgjjSearchTechService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
