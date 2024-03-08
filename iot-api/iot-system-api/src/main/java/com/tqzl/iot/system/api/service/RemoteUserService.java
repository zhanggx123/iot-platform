package com.tqzl.iot.system.api.service;

import com.tqzl.iot.common.core.constant.SecurityConstants;
import com.tqzl.iot.common.core.constant.ServiceNameConstants;
import com.tqzl.iot.common.core.model.CommonResult;
import com.tqzl.iot.common.core.model.system.User;
import com.tqzl.iot.system.api.factory.RemoteUserFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;


/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/5 15:49]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@FeignClient(contextId = "remoteUserService", value = ServiceNameConstants.SYSTEM_SERVICE, fallbackFactory = RemoteUserFallbackFactory.class)
public interface RemoteUserService {

    @GetMapping("/user/info/{username}")
    public CommonResult<User> getUserInfo(@PathVariable("username") String username, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);
}
