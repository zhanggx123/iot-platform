package com.tqzl.iot.gateway.config.security;

import cn.hutool.core.util.ObjUtil;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTUtil;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;


/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/13 13:29]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Component
public class TokenAuthenticationWebFilter implements WebFilter {

    private static final String AUTH_HEADER = "Authorization";
    private static final String BEARER = "Bearer ";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        String token = exchange.getRequest().getHeaders().getFirst("Authorization");
        if (StringUtils.hasText(token) && token.startsWith("Bearer ")) {
            token = token.substring(7);  // 去掉 "Bearer " 前缀
            JWT jwt = null;
            jwt = JWTUtil.parseToken(token);
            if (ObjUtil.isNotEmpty(jwt)) {
//                UserBO user = userService.getByJwtClaims(jwt.getClaims());

//                if (user == null) {
//                    throw new UsernameNotFoundException("用户不存在");
//                }
            }
        }

        return chain.filter(exchange);
    }
}
