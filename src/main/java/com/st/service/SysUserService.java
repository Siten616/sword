package com.st.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.st.controller.command.SysUserCommand;
import com.st.domain.SysUser;

/**
 * @author shent
 */
public interface SysUserService extends IService<SysUser> {
    void add(SysUserCommand command);
}
