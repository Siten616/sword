package com.st.common.convert;

import com.st.controller.command.SysRoleCommand;
import com.st.domain.SysRole;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

/**
 * @author shent
 */
@Mapper(componentModel = "spring")
public interface SysRoleConvert {
    @Mappings({
    })
    SysRole commandToDomain(SysRoleCommand sysRoleCommand);
}
