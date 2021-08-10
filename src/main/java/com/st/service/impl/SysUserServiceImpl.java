package com.st.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.st.common.enums.UserStatus;
import com.st.controller.command.SysUserCommand;
import com.st.common.convert.SysUserConvert;
import com.st.domain.SysUser;
import com.st.mapper.SysUserMapper;
import com.st.service.SysUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author shent
 */
@Service
@RequiredArgsConstructor
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    @Autowired
    private final SysUserMapper sysUserMapper;
    @Autowired
    SysUserConvert sysUserConvert;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void add(SysUserCommand command) {
        SysUser sysUser = sysUserConvert.commandToDomain(command);
        sysUser.setStatus(UserStatus.NORMAL.getValue());
        sysUser.setType(UserStatus.COMMON.getValue());
        sysUserMapper.insert(sysUser);
    }


}