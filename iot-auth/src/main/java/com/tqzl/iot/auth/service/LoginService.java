package com.tqzl.iot.auth.service;

import cn.hutool.core.util.ObjUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.jwt.JWTUtil;
import com.tqzl.iot.auth.form.LoginBody;
import com.tqzl.iot.common.core.constant.SecurityConstants;
import com.tqzl.iot.common.core.model.CommonResult;
import com.tqzl.iot.common.core.model.system.User;
import com.tqzl.iot.system.api.service.RemoteUserService;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/6 13:07]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Component
public class LoginService {

    private final RemoteUserService remoteUserService;

    public LoginService(RemoteUserService remoteUserService) {
        this.remoteUserService = remoteUserService;
    }

    public CommonResult login(LoginBody loginBody, HttpServletRequest request){
        String captcha = (String) request.getSession().getAttribute("captcha");
        if(StrUtil.isEmpty(loginBody.getCaptcha()) || !captcha.equals(loginBody.getCaptcha())){
            return CommonResult.error("验证码填写错误");
        }
        CommonResult<User> userInfo = remoteUserService.getUserInfo(loginBody.getUserName(), SecurityConstants.INNER);
        if(ObjUtil.isNull(userInfo.getResultObject()) || ! loginBody.getPassword().equals(userInfo.getResultObject().getPassword())){
            return CommonResult.error("用户名或密码不正确");
        }
        HashMap<String, Object> map = new HashMap<String,Object>() {
          private static final long serialVersionUID = 1L;
            {
                put("uid",userInfo.getResultObject().getId());
                put("name",userInfo.getResultObject().getUsername());
                put("UserType",userInfo.getResultObject().getUserType());
                put("Role",userInfo.getResultObject().getRole());
                put("expire",System.currentTimeMillis() + 1000 * 60 * 60 *24 *15);
            }
        };
        String token = JWTUtil.createToken(map, "123".getBytes());
        return CommonResult.success(token);
    }

}
