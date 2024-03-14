package com.tqzl.iot.modules.system.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/7 16:52]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PermissionDTO {

    private String name;

    private String permission;

}
