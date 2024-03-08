package com.tqzl.iot.modules.system.mapper;

import com.tqzl.iot.common.core.model.bo.PermissionBO;
import com.tqzl.iot.modules.system.model.dto.PermissionDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/7 15:27]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Mapper
public interface SysUserPermissionMapper {

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
    PermissionBO selectUserPermissionById(Long id);


}
