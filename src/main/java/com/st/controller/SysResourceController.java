package com.st.controller;

import com.st.controller.command.SysResourceCommand;
import com.st.service.SysResourceService;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shent
 */
@Api("资源管理")
@RestController
@RequestMapping("resource")
public class SysResourceController {

    SysResourceService sysResourceService;

    @PostMapping("add")
    public ResponseEntity<String> add(@RequestBody SysResourceCommand command) {
        sysResourceService.add(command);
        return ResponseEntity.ok("成功");
    }
}