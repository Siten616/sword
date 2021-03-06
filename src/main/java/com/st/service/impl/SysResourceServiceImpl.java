package com.st.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.st.common.convert.SysResourceConvert;
import com.st.controller.command.SysResourceCommand;
import com.st.domain.SysResource;
import com.st.mapper.SysResourceMapper;
import com.st.service.SysResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shent
 */
@Service
@RequiredArgsConstructor
public class SysResourceServiceImpl extends ServiceImpl<SysResourceMapper, SysResource> implements SysResourceService {
    @Autowired
    SysResourceMapper sysResourceMapper;
    @Autowired
    SysResourceConvert sysResourceConvert;

    @Override
    public void add(SysResourceCommand command) {
        SysResource sysResource = sysResourceConvert.commandToDomain(command);
        sysResourceMapper.insert(sysResource);
    }
}