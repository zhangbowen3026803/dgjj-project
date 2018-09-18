package io.renren.service.impl;



import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import io.renren.dao.RoleDao;
import io.renren.entity.RoleEntity;
import io.renren.service.RoleService;


@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleDao, RoleEntity> implements RoleService {


}
