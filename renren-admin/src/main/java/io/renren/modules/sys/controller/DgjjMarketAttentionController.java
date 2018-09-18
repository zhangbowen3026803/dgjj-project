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

import io.renren.modules.sys.entity.DgjjMarketAttentionEntity;
import io.renren.modules.sys.service.DgjjMarketAttentionService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 大盘关注表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-03 15:13:42
 */
@RestController
@RequestMapping("sys/dgjjmarketattention")
public class DgjjMarketAttentionController {
    @Autowired
    private DgjjMarketAttentionService dgjjMarketAttentionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:dgjjmarketattention:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = dgjjMarketAttentionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:dgjjmarketattention:info")
    public R info(@PathVariable("id") String id){
        DgjjMarketAttentionEntity dgjjMarketAttention = dgjjMarketAttentionService.selectById(id);

        return R.ok().put("dgjjMarketAttention", dgjjMarketAttention);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:dgjjmarketattention:save")
    public R save(@RequestBody DgjjMarketAttentionEntity dgjjMarketAttention){
        dgjjMarketAttentionService.insert(dgjjMarketAttention);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:dgjjmarketattention:update")
    public R update(@RequestBody DgjjMarketAttentionEntity dgjjMarketAttention){
        ValidatorUtils.validateEntity(dgjjMarketAttention);
        dgjjMarketAttentionService.updateAllColumnById(dgjjMarketAttention);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:dgjjmarketattention:delete")
    public R delete(@RequestBody String[] ids){
        dgjjMarketAttentionService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
