package com.jxtb.jsp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class JspController {

    // 从 application.properties 中读取配置，如取不到默认值为Hello
    @Value("${application.hello:Hello}")
    private String hello;


    @RequestMapping("/helloJsp")
    public String helloJsp(Map<String, Object> map) {
        map.put("hello", hello);
        return "jsp/helloJsp";
    }

}