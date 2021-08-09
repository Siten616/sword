package com.st.controller;

import com.st.service.SysLogService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shent
 */
@Api("日志管理")
@RestController
@RequestMapping("log")
public class SysLogController {

    SysLogService sysLogService;

}