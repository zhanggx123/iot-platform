package com.tqzl.iot.modules.system.controller;

import com.tqzl.iot.common.core.model.CommonResult;
import com.tqzl.iot.common.core.model.system.Menu;
import com.tqzl.iot.common.core.model.system.Permission;
import com.tqzl.iot.common.core.model.system.Role;
import com.tqzl.iot.modules.system.handler.MenuRoleHandler;
import com.tqzl.iot.modules.system.model.dto.MenuDTO;
import com.tqzl.iot.modules.system.model.dto.PermissionDTO;
import com.tqzl.iot.modules.system.model.dto.RoleDTO;
import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/7 15:59]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Api("菜单角色信息")
@RestController
@RequestMapping("/sys")
public class SysUserMenuPermissionController {

    private final MenuRoleHandler menuRoleHandler;

    public SysUserMenuPermissionController(MenuRoleHandler menuRoleHandler) {
        this.menuRoleHandler = menuRoleHandler;
    }

    @GetMapping("/menu/{id}")
    public CommonResult queryMenuById(@PathVariable("id") int id){
        Menu menu = menuRoleHandler.queryMenuById(id);
        return CommonResult.success(menu);
    }

    @PostMapping(value = "/deleteMenu", produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResult deleteMenuById(@RequestParam int id){
        menuRoleHandler.deleteMenuById(id);
        return CommonResult.success("更新成功!");
    }

    @GetMapping("/menuRole/{id}")
    public CommonResult queryMenuRoleById(@PathVariable("id") int id){
        Permission permission = menuRoleHandler.queryMenuRoleById(id);
        return CommonResult.success(permission);
    }

    @PostMapping(value = "/deleteMenuRole" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResult deleteMenuRoleById(@RequestParam int id){
        menuRoleHandler.deleteMenuRoleById(id);
        return CommonResult.success("更新成功!");
    }

    @GetMapping("/role/{id}")
    public CommonResult queryRoleByRoleId(@PathVariable("id") int id){
        Role role = menuRoleHandler.queryRoleByRoleId(id);
        return CommonResult.success(role);
    }

    @PostMapping(value = "/deleteRole" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResult deleteRoleByRoleId(int id){
        menuRoleHandler.deleteRoleByRoleId(id);
        return CommonResult.success("更新成功!");
    }

    @PostMapping(value = "/addMenu" , produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResult addMenu(@RequestBody MenuDTO dto){
        menuRoleHandler.addMenu(dto);
        return CommonResult.success("更新成功!");
    }

    @PostMapping(value = "/updateMenu", produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResult updateMenu(@RequestBody MenuDTO dto){
        menuRoleHandler.updateMenu(dto);
        return CommonResult.success("更新成功!");
    }

    @PostMapping(value = "/addMenuRole" , produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResult addMenuRole(@RequestBody PermissionDTO dto){
        menuRoleHandler.addMenuRole(dto);
        return CommonResult.success("更新成功!");
    }

    @PostMapping(value = "/addRole", produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResult addRole(@RequestBody RoleDTO dto){
        menuRoleHandler.addRole(dto);
        return CommonResult.success("更新成功!");
    }

    @PostMapping(value = "/updateRole", produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResult updateRole(@RequestBody RoleDTO dto){
        menuRoleHandler.updateRole(dto);
        return CommonResult.success("更新成功!");
    }

}
