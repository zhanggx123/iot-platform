package com.tqzl.iot.modules.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.tqzl.iot.common.core.model.bo.MenuBO;
import com.tqzl.iot.common.core.model.system.Menu;
import com.tqzl.iot.modules.system.mapper.SysUserMenuMapper;
import com.tqzl.iot.modules.system.model.dto.MenuDTO;
import com.tqzl.iot.modules.system.service.ISysUserMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/7 15:30]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Service
public class SysUserMenuServiceImpl implements ISysUserMenuService {

    private final SysUserMenuMapper userMenuMapper;

    public SysUserMenuServiceImpl(SysUserMenuMapper userMenuMapper) {
        this.userMenuMapper = userMenuMapper;
    }

    @Override
    public void insertUserMenu(MenuDTO dto) {
        userMenuMapper.insertUserMenu(dto);
    }

    @Override
    public void deleteUserMenuById(Long id) {
        userMenuMapper.deleteUserMenuById(id);
    }

    @Override
    public void updateUserMenu(MenuDTO dto) {
        userMenuMapper.updateUserMenu(dto);
    }

    @Override
    public Menu selectUserMenuById(Long id) {
        MenuBO menuBO = userMenuMapper.selectUserMenuById(id);
        return BeanUtil.copyProperties(menuBO,Menu.class);
    }
}
