package com.st.testController;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shent
 */
@Api("首页")
@RestController
@RequestMapping("index")
public class IndexController {
    @GetMapping("index")
    public String index() {
        return "首页";
    }
    @GetMapping("logout")
    public String logout() {
        return "退出成功";
    }
}
