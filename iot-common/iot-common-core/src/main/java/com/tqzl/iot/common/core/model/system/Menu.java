package com.tqzl.iot.common.core.model.system;

import com.tqzl.iot.common.core.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/7 14:47]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Menu extends BaseEntity {

    private String name;

    private String menu;

}
