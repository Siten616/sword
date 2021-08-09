package com.st.controller;

import com.st.service.SysUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shent
 */
@Api("用户管理")
@RestController
@RequestMapping("user")
public class SysUserController {
    @Autowired
    SysUserService sysUserService;

    @PostMapping("add")
    public ResponseEntity<String> add() {
        sysUserService.add();
        return ResponseEntity.ok("");
    }
}