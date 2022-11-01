package com.konrad.springcrudone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    private final static String LOGIN_VIEW_NAME = "login";
    
    @RequestMapping("/login")
    public String index(){
        return LOGIN_VIEW_NAME;
    }
}