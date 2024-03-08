package com.tqzl.iot.common.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/6 11:25]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@AllArgsConstructor
@Getter
public enum JwtEnum {
    /**
     * claim userId
     */
    CLAIM_USER_ID("userId", "claim userId"),
    /**
     * claim exp
     */
    CLAIM_EXPIRES_AT("exp", "claim expiresAt"),
    ;

    private final String code;
    private final String value;
}
