package com.seven.docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author seven
 * @Date 2021/2/19 16:17
 * @Description
 * @Version 1.0
 */
@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "hello docker~";
    }
}
