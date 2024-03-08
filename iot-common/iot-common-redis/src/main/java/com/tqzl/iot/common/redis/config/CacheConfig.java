package com.tqzl.iot.common.redis.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.time.Duration;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/6 11:02]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Configuration
@AutoConfigureAfter(RedisConfig.class)
public class CacheConfig {

    private final RedisSerializer<Object> jackson2JsonRedisSerializer;

    public CacheConfig(RedisSerializer<Object> jackson2JsonRedisSerializer) {
        this.jackson2JsonRedisSerializer = jackson2JsonRedisSerializer;
    }

    @Bean
    public RedisCacheManager spotAdvisorCacheManager(RedisConnectionFactory factory) {
        // JSON序列化配置
        RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig()
                .entryTtl(Duration.ofHours(1))
                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(new StringRedisSerializer()))  //设置key序列化器
                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(jackson2JsonRedisSerializer))  //设置value序列化器
                .disableCachingNullValues()
                .prefixCacheNameWith("data:engine:cache:advisor:");
        return RedisCacheManager.builder(factory)
                .cacheDefaults(redisCacheConfiguration)
                .transactionAware()
                .build();
    }

}
