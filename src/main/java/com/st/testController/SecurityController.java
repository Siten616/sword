package com.st.testController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shent
 */
@Controller
@RequestMapping("/static")
public class SecurityController {

    @GetMapping(value = {"/home"})
    public String home() {
        return "home";
    }

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping(value = "/loging")
    public String login() {
        return "login";
    }
}
