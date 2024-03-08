package com.tqzl.iot.modules.system.service;

import com.tqzl.iot.common.core.model.system.User;
import com.tqzl.iot.modules.system.model.dto.UserDTO;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/6 13:14]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
public interface ISysUserService {

    /**
     * 根据用户名称查询用户
     * @param name
     * @return
     */
    User queryUserByUserName(String name);

    /**
     * 新增用户
     * @param dto
     */
    void insertUser(UserDTO dto);

    /**
     * 根据id删除用户
     * @param id
     */
    void deleteUserById(Long id);

    /**
     * 更新用户
     * @param dto
     */
    void updateUser(UserDTO dto);

}
