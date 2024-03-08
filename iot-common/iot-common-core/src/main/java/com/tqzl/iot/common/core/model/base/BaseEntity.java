package com.tqzl.iot.common.core.model.base;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/6 9:40]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Getter
@Setter
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -2222825396436078643L;

    private Long id;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private int status;

}
