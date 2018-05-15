package com.lywx.userservice.controller;

import com.lywx.userservice.entity.User;
import com.lywx.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zoulifu
 * @version V1.0
 * @Description:
 * @date: 2018/5/9 10:43
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Value("${server.port}")
    String port;
    @GetMapping("/show")
    public User getUserList(long userId){
        return  userService.getUserList(userId);
    }
    @GetMapping("/userId/{userId}")
    public User findByUser(@PathVariable Long userId){
        System.out.println("hi,I am from port:"+ port);
        return  userService.getUserList(userId);
    }
}
