package com.st.controller;

import com.st.service.SysRoleService;
import io.swagger.annotations.Api;
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

}