package com.st.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.st.domain.SysUser;
import com.st.mapper.SysUserMapper;
import com.st.service.SysUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shent
 */
@Service
@RequiredArgsConstructor
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    @Autowired
    private final SysUserMapper sysUserMapper;

    @Override
    public void add() {
        SysUser user = new SysUser();

        user.setGender(1);
        user.setPassword("123456");
        user.setRealname("张三");
        user.setType(0);
        user.setStatus(1);
        user.setTelphone("15565253659");
        user.setUsername("zhangsan");
        sysUserMapper.insert(user);
    }
}