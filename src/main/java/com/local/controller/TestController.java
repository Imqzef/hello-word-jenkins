package com.local.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: hello-world-jenkins
 * @Author: Qiao
 * @Description:
 * @Date: 2020/3/18 14:32
 */
@RestController
@RequestMapping("/jenkins")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World Jenkins";
    }
}
