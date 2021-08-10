package com.st.common.convert;

import com.st.controller.command.SysUserCommand;
import com.st.domain.SysUser;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * @author shent
 */
@Mapper(componentModel = "spring")
public interface SysUserConvert {
    @Mappings({
            @Mapping(source = "password", target = "password"),
            @Mapping(source = "realname", target = "realname")
    })
    SysUser commandToDomain(SysUserCommand sysUserCommand);
}
