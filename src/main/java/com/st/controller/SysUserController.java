package com.st.controller;

import com.st.controller.command.SysUserCommand;
import com.st.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @ApiOperation(value = "新增用户")
    @PostMapping("add")
    public ResponseEntity<String> add(@RequestBody SysUserCommand command) {
        sysUserService.add(command);
        return ResponseEntity.ok("成功");
    }


}