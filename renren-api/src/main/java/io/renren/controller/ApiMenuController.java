package io.renren.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.R;
import io.renren.entity.MenuEntity;
import io.renren.form.MenuForm;
import io.renren.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



/**
 * 移动菜单管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-07 21:17:51
 */
@RestController
@RequestMapping("/api")
@Api(tags="我的菜单接口")
public class ApiMenuController {
    @Autowired
    private MenuService menuService;

    @PostMapping("menu/add")
    @ApiOperation("菜单新增")
    public R add(MenuForm form){
    	
        MenuEntity menu = new MenuEntity();
        menu.setName(form.getName());
        menu.setUrl(form.getUrl());
        menu.setOrderNum(form.getOrderNum());
        menuService.insertOrUpdate(menu);

        return R.ok();
    }

}
