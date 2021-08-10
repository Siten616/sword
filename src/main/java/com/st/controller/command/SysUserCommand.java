package com.st.controller.command;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author shent
 */
@Data
public class SysUserCommand {
    @ApiModelProperty("主键ID 可不传")
    private Long id;

    @ApiModelProperty("用户名")
    @NotEmpty
    private String username;

    @ApiModelProperty("真实姓名")
    private String realname;

    @ApiModelProperty("手机")
    private String telphone;

    @ApiModelProperty("性别")
    private Integer gender;

    @ApiModelProperty("密码")
    private String password;
}
