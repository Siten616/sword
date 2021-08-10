package com.st.service;

import com.st.SwordStarter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author shent
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = SwordStarter.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserServiceTest {
    @Autowired
    SysUserService sysUserService;

    @Test
    public void add() {
//        SysUser sysUser = new SysUser();
//        sysUser.setGender(1);
//        sysUser.setPassword("123456");
//        sysUser.setRealname("张三");
//        sysUser.setType(0);
//        sysUser.setStatus(1);
//        sysUser.setTelphone("15565253659");
//        sysUser.setUsername("zhangsan");
//        sysUserService.add(sysUser);
    }

}
