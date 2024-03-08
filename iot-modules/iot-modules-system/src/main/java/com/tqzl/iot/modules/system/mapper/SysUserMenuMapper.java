package com.tqzl.iot.modules.system.mapper;

import com.tqzl.iot.common.core.model.bo.MenuBO;
import com.tqzl.iot.modules.system.model.dto.MenuDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/7 15:26]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Mapper
public interface SysUserMenuMapper {

    /**
     * 新增数据
     * @param dto
     */
    void insertUserMenu(MenuDTO dto);

    /**
     * 删除数据
     * @param id
     */
    void deleteUserMenuById(Long id);

    /**
     * 更新数据
     * @param dto
     */
    void updateUserMenu(MenuDTO dto);

    /**
     * 查询数据
     * @param id
     * @return
     */
    MenuBO selectUserMenuById(Long id);

}
