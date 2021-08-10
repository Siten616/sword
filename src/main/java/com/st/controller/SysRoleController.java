package com.st.controller;

import com.st.controller.command.SysRoleCommand;
import com.st.service.SysRoleService;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shent
 */
@Api("角色管理")
@RestController
@RequestMapping("role")
public class SysRoleController {

    SysRoleService sysRoleService;

    @PostMapping("add")
    public ResponseEntity<String> add(@RequestBody SysRoleCommand command) {
        sysRoleService.add(command);
        return ResponseEntity.ok("成功");
    }
}