package com.tqzl.iot.auth.controller;

import com.tqzl.iot.auth.form.LoginBody;
import com.tqzl.iot.auth.service.LoginService;
import com.tqzl.iot.common.core.model.CommonResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/6 11:59]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Api("登录接口")
@RestController
public class AuthController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public CommonResult login(@RequestBody LoginBody loginBody, HttpServletRequest request){
        return loginService.login(loginBody, request);
    }

}


