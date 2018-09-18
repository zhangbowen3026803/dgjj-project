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

import io.renren.modules.sys.entity.DgjjMarketEntity;
import io.renren.modules.sys.service.DgjjMarketService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 技术大盘表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-03 15:13:42
 */
@RestController
@RequestMapping("sys/dgjjmarket")
public class DgjjMarketController {
    @Autowired
    private DgjjMarketService dgjjMarketService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:dgjjmarket:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = dgjjMarketService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:dgjjmarket:info")
    public R info(@PathVariable("id") Long id){
        DgjjMarketEntity dgjjMarket = dgjjMarketService.selectById(id);

        return R.ok().put("dgjjMarket", dgjjMarket);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:dgjjmarket:save")
    public R save(@RequestBody DgjjMarketEntity dgjjMarket){
        dgjjMarketService.insert(dgjjMarket);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:dgjjmarket:update")
    public R update(@RequestBody DgjjMarketEntity dgjjMarket){
        ValidatorUtils.validateEntity(dgjjMarket);
        dgjjMarketService.updateAllColumnById(dgjjMarket);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:dgjjmarket:delete")
    public R delete(@RequestBody Long[] ids){
        dgjjMarketService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
