package com.tqzl.iot.modules.system.service;

import com.tqzl.iot.common.core.model.system.Permission;
import com.tqzl.iot.modules.system.model.dto.PermissionDTO;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/7 15:29]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
public interface ISysUserPermissionService {


    /**
     * 插入数据
     * @param dto
     */
    void insertUserPermission(PermissionDTO dto);

    /**
     * 删除数据
     * @param id
     */
    void deleteUserPermissionById(Long id);

    /**
     * 更新数据
     * @param dto
     */
    void updateUserPermission(PermissionDTO dto);

    /**
     * 查询数据
     * @param id
     * @return
     */
    Permission selectUserPermissionById(Long id);
}
