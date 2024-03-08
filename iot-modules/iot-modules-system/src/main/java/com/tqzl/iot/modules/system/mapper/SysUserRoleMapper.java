package com.tqzl.iot.modules.system.mapper;

import com.tqzl.iot.common.core.model.bo.RoleBO;
import com.tqzl.iot.modules.system.model.dto.RoleDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/7 15:27]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Mapper
public interface SysUserRoleMapper {

    /**
     * 新增数据
     * @param dto
     */
    void insertUserRole(RoleDTO dto);

    /**
     * 删除数据
     * @param id
     */
    void deleteUserRoleById(Long id);

    /**
     * 更新数据
     * @param dto
     */
    void updateUserRole(RoleDTO dto);

    /**
     * 查询数据
     * @param id
     * @return
     */
    RoleBO selectUserRoleById(Long id);

}
