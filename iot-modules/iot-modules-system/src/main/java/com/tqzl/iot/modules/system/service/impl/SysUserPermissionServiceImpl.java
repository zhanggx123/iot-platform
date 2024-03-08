package com.tqzl.iot.modules.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.tqzl.iot.common.core.model.bo.PermissionBO;
import com.tqzl.iot.common.core.model.system.Permission;
import com.tqzl.iot.modules.system.mapper.SysUserPermissionMapper;
import com.tqzl.iot.modules.system.model.dto.PermissionDTO;
import com.tqzl.iot.modules.system.service.ISysUserPermissionService;
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
public class SysUserPermissionServiceImpl implements ISysUserPermissionService {

    private final SysUserPermissionMapper userPermissionMapper;

    public SysUserPermissionServiceImpl(SysUserPermissionMapper userPermissionMapper) {
        this.userPermissionMapper = userPermissionMapper;
    }

    @Override
    public void insertUserPermission(PermissionDTO dto) {
        userPermissionMapper.insertUserPermission(dto);
    }

    @Override
    public void deleteUserPermissionById(Long id) {
        userPermissionMapper.deleteUserPermissionById(id);
    }

    @Override
    public void updateUserPermission(PermissionDTO dto) {
        userPermissionMapper.updateUserPermission(dto);
    }

    @Override
    public Permission selectUserPermissionById(Long id) {
        PermissionBO permissionBO = userPermissionMapper.selectUserPermissionById(id);
        return BeanUtil.copyProperties(permissionBO,Permission.class);
    }
}