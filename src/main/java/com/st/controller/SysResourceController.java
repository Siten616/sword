package com.st.controller;

import com.st.service.SysResourceService;
import io.swagger.annotations.Api;
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

}