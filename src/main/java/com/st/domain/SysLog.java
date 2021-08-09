package com.st.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author shent
 */
@ApiModel(value="com-st-domain-SysLog")
@Data
public class SysLog {
    /**
    * id
    */
    @ApiModelProperty(value="id")
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /**
    * 类型(1查询2新增3修改4删除5其他)
    */
    @ApiModelProperty(value="类型(1查询2新增3修改4删除5其他)")
    private Integer type;

    /**
    * 模块代码
    */
    @ApiModelProperty(value="模块代码")
    private String moduleCode;

    /**
    * 模块名称
    */
    @ApiModelProperty(value="模块名称")
    private String moduleName;

    /**
    * 操作内容
    */
    @ApiModelProperty(value="操作内容")
    private String content;

    /**
    * ip地址
    */
    @ApiModelProperty(value="ip地址")
    private String ipAddress;

    /**
    * ip地址所在城市
    */
    @ApiModelProperty(value="ip地址所在城市")
    private String ipCity;

    /**
    * 主机名
    */
    @ApiModelProperty(value="主机名")
    private String hostName;

    /**
    * 浏览器
    */
    @ApiModelProperty(value="浏览器")
    private String browserName;

    /**
    * 操作用户id
    */
    @ApiModelProperty(value="操作用户id")
    private String operateUserId;

    /**
    * 操作用户用户名
    */
    @ApiModelProperty(value="操作用户用户名")
    private String operateUserName;

    /**
    * 操作时间
    */
    @ApiModelProperty(value="操作时间")
    private Long operateTime;
}