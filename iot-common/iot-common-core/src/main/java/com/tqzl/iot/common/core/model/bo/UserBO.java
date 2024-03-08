package com.tqzl.iot.common.core.model.bo;

import com.tqzl.iot.common.core.model.base.BaseEntity;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/6 11:27]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserBO extends BaseEntity {

    private String username;

    private String password;

    private String userType;

    private String role;

    private String permission;

    private int menu;

}
