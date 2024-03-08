package com.tqzl.iot.modules.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.tqzl.iot.common.core.model.bo.RoleBO;
import com.tqzl.iot.common.core.model.system.Role;
import com.tqzl.iot.modules.system.mapper.SysUserRoleMapper;
import com.tqzl.iot.modules.system.model.dto.RoleDTO;
import com.tqzl.iot.modules.system.service.ISysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/7 15:31]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Service
public class SysUserRoleServiceImpl implements ISysUserRoleService {

    private final SysUserRoleMapper userRoleMapper;

    public SysUserRoleServiceImpl(SysUserRoleMapper userRoleMapper) {
        this.userRoleMapper = userRoleMapper;
    }

    @Override
    public void insertUserRole(RoleDTO dto) {
        userRoleMapper.insertUserRole(dto);
    }

    @Override
    public void deleteUserRoleById(Long id) {
        userRoleMapper.deleteUserRoleById(id);
    }

    @Override
    public void updateUserRole(RoleDTO dto) {
        userRoleMapper.updateUserRole(dto);
    }

    @Override
    public Role selectUserRoleById(Long id) {
        RoleBO roleBO = userRoleMapper.selectUserRoleById(id);
        return BeanUtil.copyProperties(roleBO,Role.class);
    }
}