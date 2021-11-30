package com.bridgelabz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Purpose : To invoke a simple HTML page by using MVC Controller
 * @author SUDIP PANJA
 * @version : 0.0.1-SNAPSHOT
 * @since 2021-12-01
 */
@Controller
public class HelloWebController {

    @GetMapping("/web")
    public String hello() {
        return "hello";
    }
}
