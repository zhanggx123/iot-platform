package com.tqzl.iot.modules.system.service;

import com.tqzl.iot.common.core.model.system.Menu;
import com.tqzl.iot.modules.system.model.dto.MenuDTO;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/7 15:28]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
public interface ISysUserMenuService {


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
    Menu selectUserMenuById(Long id);

}
