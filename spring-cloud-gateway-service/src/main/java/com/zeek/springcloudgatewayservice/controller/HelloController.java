package com.zeek.springcloudgatewayservice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liweibo03 <liweibo03@kuaishou.com>
 * Created on 2021-01-29
 */
@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String helloRoot() {
        return "/";
    }

    @GetMapping(value = "/hello")
    public String hello(HttpServletRequest request) {
        System.out.println("/hello");
        return "world";
    }
}
