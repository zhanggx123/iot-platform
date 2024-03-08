package com.tqzl.iot.modules.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.tqzl.iot.common.core.model.system.User;
import com.tqzl.iot.common.core.model.bo.UserBO;
import com.tqzl.iot.modules.system.mapper.SysUserMapper;
import com.tqzl.iot.modules.system.model.dto.UserDTO;
import com.tqzl.iot.modules.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/6 13:15]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Service
public class SysUserServiceImpl implements ISysUserService {

    private final SysUserMapper userMapper;

    public SysUserServiceImpl(SysUserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User queryUserByUserName(String name) {
        UserBO user = userMapper.queryUserByUserName(name);
        return BeanUtil.copyProperties(user,User.class);
    }

    @Override
    public void insertUser(UserDTO dto) {

    }

    @Override
    public void deleteUserById(Long id) {

    }

    @Override
    public void updateUser(UserDTO dto) {

    }
}
