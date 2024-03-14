package com.tqzl.iot.modules.system.handler;

import com.tqzl.iot.common.core.model.system.Menu;
import com.tqzl.iot.common.core.model.system.Permission;
import com.tqzl.iot.common.core.model.system.Role;
import com.tqzl.iot.modules.system.model.dto.MenuDTO;
import com.tqzl.iot.modules.system.model.dto.PermissionDTO;
import com.tqzl.iot.modules.system.model.dto.RoleDTO;
import com.tqzl.iot.modules.system.service.ISysUserMenuService;
import com.tqzl.iot.modules.system.service.ISysUserPermissionService;
import com.tqzl.iot.modules.system.service.ISysUserRoleService;
import org.springframework.stereotype.Component;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/8 11:07]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Component
public class MenuRoleHandler {

    private final ISysUserRoleService userRoleService;
    private final ISysUserPermissionService userPermissionService;
    private final ISysUserMenuService userMenuService;

    public MenuRoleHandler(ISysUserRoleService userRoleService, ISysUserPermissionService userPermissionService, ISysUserMenuService userMenuService) {
        this.userRoleService = userRoleService;
        this.userPermissionService = userPermissionService;
        this.userMenuService = userMenuService;
    }


    public Menu queryMenuByName(String name){
        return userMenuService.selectUserMenuByName(name);
    }

    public void deleteMenuById(long menuId){
        userMenuService.deleteUserMenuById(menuId);
    }

    public Permission queryMenuRoleById(long id){
        return userPermissionService.selectUserPermissionById(id);
    }

    public void deleteMenuRoleById(long mid){
        userPermissionService.deleteUserPermissionById(mid);
    }

    public Role queryRoleByRoleId(long roleId){
        return userRoleService.selectUserRoleById(roleId);
    }

    public void deleteRoleByRoleId(long roleId){
        userRoleService.deleteUserRoleById(roleId);
    }

    public void addMenu(MenuDTO dto){
        userMenuService.insertUserMenu(dto);
    }

    public void updateMenu(MenuDTO dto){
        userMenuService.updateUserMenu(dto);
    }

    public void addRole(RoleDTO dto){
        userRoleService.insertUserRole(dto);
    }

    public void updateRole(RoleDTO dto){
        userRoleService.updateUserRole(dto);
    }

    public void addMenuRole(PermissionDTO dto){
        userPermissionService.insertUserPermission(dto);
    }

    public void updateMenuRole(PermissionDTO dto){
        userPermissionService.updateUserPermission(dto);
    }

}
