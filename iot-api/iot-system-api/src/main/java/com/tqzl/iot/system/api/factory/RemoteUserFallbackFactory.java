package com.tqzl.iot.system.api.factory;

import com.tqzl.iot.common.core.model.CommonResult;
import com.tqzl.iot.common.core.model.bo.UserBO;
import com.tqzl.iot.common.core.model.system.User;
import com.tqzl.iot.system.api.service.RemoteUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/5 15:49]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Component
public class RemoteUserFallbackFactory implements FallbackFactory<RemoteUserService>{

    private static final Logger log = LoggerFactory.getLogger(RemoteUserFallbackFactory.class);

    @Override
    public RemoteUserService create(Throwable cause) {
        log.error("用户服务调用失败:{}", cause.getMessage());
        return new RemoteUserService()
        {
            @Override
            public CommonResult<User> getUserInfo(String username, String source)
            {
                return CommonResult.fail("获取用户失败:" + cause.getMessage());
            }
        };
    }

}
