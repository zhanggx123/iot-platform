package com.tqzl.iot.common.core.model.bo;

import com.tqzl.iot.common.core.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/7 15:10]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ApiModel("")
public class PermissionBO extends BaseEntity {

    @ApiModelProperty("")
    private String name;
    @ApiModelProperty("")
    private String permission;

}
