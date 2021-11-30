package com.bridgelabz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Purpose : To simulate a simple welcome message by using REST Controller
 *
 * @author SUDIP PANJA
 * @version : 0.0.1-SNAPSHOT
 * @since 2021-12-01
 */
@RestController
public class HelloRestController {

    @RequestMapping("/greet")
    public String index() {
        return "Hello From BridgeLabz";
    }
}
