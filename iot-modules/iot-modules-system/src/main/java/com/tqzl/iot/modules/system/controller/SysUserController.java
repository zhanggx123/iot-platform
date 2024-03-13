package com.tqzl.iot.modules.system.controller;

import com.tqzl.iot.common.core.model.CommonResult;
import com.tqzl.iot.common.core.model.system.User;
import com.tqzl.iot.modules.system.model.dto.UserDTO;
import com.tqzl.iot.modules.system.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/6 13:13]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Api("用户信息")
@RestController
@RequestMapping("/user")
public class SysUserController {

    private final ISysUserService sysUserService;

    public SysUserController(ISysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }


    /**
     * 获取当前用户信息
     */
    @GetMapping("/info/{username}")
    @ApiOperation("获取当前用户信息")
    public CommonResult<User> info(@PathVariable("username") String username)
    {
        User user = sysUserService.queryUserByUserName(username);
        return CommonResult.success(user);
    }

    @PostMapping("/createUser")
    @ApiOperation("创建用户")
    public CommonResult createUser(@RequestBody UserDTO dto){
        sysUserService.insertUser(dto);
        return CommonResult.success("创建成功");
    }

    @PostMapping("/updateUser")
    public CommonResult updateUser(@RequestBody UserDTO dto){
        sysUserService.updateUser(dto);
        return CommonResult.success("更新成功");
    }

}
