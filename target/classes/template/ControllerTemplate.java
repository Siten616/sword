package com.st.controller;

import com.st.service.SysLogService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shent
 */
@Api("${baseName}管理")
@RestController
@RequestMapping("${baseName}")
public class ${baseName}Controller {

    ${baseName}Service ${baseName_u}Service;

}