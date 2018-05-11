package com.lywx.eurekauser.controller;

import com.lywx.eurekauser.entity.User;
import com.lywx.eurekauser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/show")
    public User getUserList(long userId){
        return  userService.getUserList(userId);
    }
    @GetMapping("/userId/{userId}")
    public User findByUser(@PathVariable Long userId){
        return  userService.getUserList(userId);
    }
}
