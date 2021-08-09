package com.st.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @author shent
 */
@ApiModel(value="com-st-domain-SysUser")
@Data
public class SysUser {
    /**
    * id
    */
    @ApiModelProperty(value="id")
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Integer id;

    /**
    * 用户名
    */
    @ApiModelProperty(value="用户名")
    private String username;

    /**
    * 真实姓名
    */
    @ApiModelProperty(value="真实姓名")
    private String realname;

    /**
    * 性别
    */
    @ApiModelProperty(value="性别")
    private Integer gender;

    /**
    * 密码
    */
    @ApiModelProperty(value="密码")
    private String password;

    /**
    * 手机号
    */
    @ApiModelProperty(value="手机号")
    private String telphone;

    /**
    * 状态（0禁用 1正常）
    */
    @ApiModelProperty(value="状态（0禁用 1正常）")
    private Integer status;

    /**
    * 用户类型（0管理员1普通）
    */
    @ApiModelProperty(value="用户类型（0管理员1普通）")
    private Integer type;
}