package com.lywx.userhystrixfeign.controller;

import com.lywx.userhystrixfeign.entity.User;
import com.lywx.userhystrixfeign.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zoulifu
 * @version V1.0
 * @Description:Feign基础使用
 * @date: 2018/5/10 11:00
 */
@RestController
public class UserHystrixFeignController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/userId/{userId}")
    public User findByIdUser(@PathVariable Long userId){
        return userFeignClient.findById(userId);
    }
}
