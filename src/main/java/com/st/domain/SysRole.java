package com.st.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @author shent
 */
@ApiModel(value="com-st-domain-SysRole")
@Data
public class SysRole {
    /**
    * id
    */
    @ApiModelProperty(value="id")
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /**
    * 名称
    */
    @ApiModelProperty(value="名称")
    private String name;

    /**
    * 备注
    */
    @ApiModelProperty(value="备注")
    private String remark;
}