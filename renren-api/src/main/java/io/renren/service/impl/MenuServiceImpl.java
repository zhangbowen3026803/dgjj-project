package io.renren.service.impl;



import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import io.renren.dao.MenuDao;
import io.renren.entity.MenuEntity;
import io.renren.service.MenuService;


@Service("menuService")
public class MenuServiceImpl extends ServiceImpl<MenuDao, MenuEntity> implements MenuService {


}
