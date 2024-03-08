package com.tqzl.iot.gateway.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/5 11:44]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Configuration
@EnableWebFluxSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
    return    http
                .authorizeExchange()
//                .pathMatchers("/swagger-ui/index.html").permitAll()
//                .pathMatchers("/swagger-resources/**").permitAll()
//                .pathMatchers("/v2/api-docs").authenticated()
//                .pathMatchers("/system/v2/api-docs").permitAll()
//                .pathMatchers("/auth/captcha").permitAll()
//                .pathMatchers("/webjars/**").permitAll()
//                .pathMatchers("/doc.html").permitAll()
                .pathMatchers("/**").permitAll()
                .anyExchange().permitAll()
                .and()
                .formLogin()
                .and()
                .logout()
                .and()
                .csrf().disable()
                .build();

    }

}
