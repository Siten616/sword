package com.st.common.convert;

import com.st.controller.command.SysResourceCommand;
import com.st.domain.SysResource;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

/**
 * @author shent
 */
@Mapper(componentModel = "spring")
public interface SysResourceConvert {
    @Mappings({
    })
    SysResource commandToDomain(SysResourceCommand sysResourceCommand);
}
