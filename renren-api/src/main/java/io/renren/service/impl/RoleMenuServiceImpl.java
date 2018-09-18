package io.renren.service.impl;



import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import io.renren.dao.RoleMenuDao;
import io.renren.entity.RoleMenuEntity;
import io.renren.service.RoleMenuService;


@Service("roleMenuService")
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuDao, RoleMenuEntity> implements RoleMenuService {


}
