package com.st.controller.command;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author shent
 */
@Data
public class SysRoleCommand {
    /**
     * id
     */
    @ApiModelProperty("主键ID 可不传")
    private Long id;
    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;
}
