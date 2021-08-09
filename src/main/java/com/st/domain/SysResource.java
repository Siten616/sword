package com.st.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @author shent
 */
@ApiModel(value="com-st-domain-SysResource")
@Data
public class SysResource {
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
    * 类型（0菜单 1 按钮）
    */
    @ApiModelProperty(value="类型（0菜单 1 按钮）")
    private Integer type;

    /**
    * 级别
    */
    @ApiModelProperty(value="级别")
    private Integer level;

    /**
    * 代码
    */
    @ApiModelProperty(value="代码")
    private String code;

    /**
    * 排序
    */
    @ApiModelProperty(value="排序")
    private Byte orderNum;

    /**
    * 链接
    */
    @ApiModelProperty(value="链接")
    private String url;

    /**
    * 父ID（根节点id为0）
    */
    @ApiModelProperty(value="父ID（根节点id为0）")
    private Integer parentId;

    /**
    * 备注
    */
    @ApiModelProperty(value="备注")
    private String remark;
}