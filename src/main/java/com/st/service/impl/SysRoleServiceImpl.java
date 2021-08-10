package com.st.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.st.common.convert.SysRoleConvert;
import com.st.controller.command.SysRoleCommand;
import com.st.domain.SysRole;
import com.st.mapper.SysRoleMapper;
import com.st.service.SysRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author shent
 */
@Service
@RequiredArgsConstructor
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
    @Autowired
    SysRoleMapper sysRoleMapper;
    @Autowired
    SysRoleConvert sysRoleConvert;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void add(SysRoleCommand command) {
        SysRole sysRole = sysRoleConvert.commandToDomain(command);
        sysRoleMapper.insert(sysRole);
    }
}