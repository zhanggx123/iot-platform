package com.tqzl.iot.common.core.model.system;

import com.tqzl.iot.common.core.model.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/7 15:04]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Permission extends BaseEntity {

    private String name;

    private String permission;

}
