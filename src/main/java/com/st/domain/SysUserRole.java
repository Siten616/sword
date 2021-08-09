package com.st.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @author shent
 */
@ApiModel(value="com-st-domain-SysUserRole")
@Data
public class SysUserRole {
    /**
    * id
    */
    @ApiModelProperty(value="id")
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /**
    * 用户id
    */
    @ApiModelProperty(value="用户id")
    private Long userId;

    /**
    * 角色id
    */
    @ApiModelProperty(value="角色id")
    private Long roleId;
}