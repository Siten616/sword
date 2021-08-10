package com.st.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.st.controller.command.SysResourceCommand;
import com.st.domain.SysResource;

/**
 * @author shent
 */
public interface SysResourceService extends IService<SysResource> {

    void add(SysResourceCommand command);
}
