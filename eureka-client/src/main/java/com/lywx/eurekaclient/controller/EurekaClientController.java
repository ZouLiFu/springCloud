package com.lywx.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zoulifu
 * @version V1.0
 * @Description:Eureka测试服务控制器
 * @date: 2018/5/8 12:04
 */
@RestController
public class EurekaClientController {
    @Value("${server.port}")
    String port;
    @GetMapping("client")
    public String EurekaClient(@RequestParam String name){
        return "hi "+ name + ",i am from port:" + port;
    }
}
