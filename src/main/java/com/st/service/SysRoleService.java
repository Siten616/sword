package com.st.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.st.controller.command.SysRoleCommand;
import com.st.domain.SysRole;

/**
 * @author shent
 */
public interface SysRoleService extends IService<SysRole> {

    void add(SysRoleCommand command);
}
