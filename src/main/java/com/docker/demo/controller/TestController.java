package com.docker.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * 标题：TestController
 * 说明：
 * 时间：2022/7/12 14:47
 *
 * @author TC
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${server.port}")
    private String port;
    @RequestMapping(value = "/just",method = RequestMethod.GET)
    public String test() {
        System.out.println("in咯！");
        return "李娇傻逼" + "\t" + port + "\t" + UUID.randomUUID().toString();
    }
}
