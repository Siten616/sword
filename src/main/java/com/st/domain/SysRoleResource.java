package com.st.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @author shent
 */
@ApiModel(value="com-st-domain-SysRoleResource")
@Data
public class SysRoleResource {
    /**
    * id
    */
    @ApiModelProperty(value="id")
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /**
    * 角色id
    */
    @ApiModelProperty(value="角色id")
    private Long roleId;

    /**
    * 资源id
    */
    @ApiModelProperty(value="资源id")
    private Long resourceId;
}