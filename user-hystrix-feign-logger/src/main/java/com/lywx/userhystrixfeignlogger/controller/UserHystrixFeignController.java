package com.lywx.userhystrixfeignlogger.controller;

import com.lywx.userhystrixfeignlogger.entity.User;
import com.lywx.userhystrixfeignlogger.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zoulifu
 * @version V1.0
 * @Description:本来是想查看日志的，结果后台一直报超时，并没有打印出日志
 * 暂时没有找到原因。。。。
 * @date: 2018/5/10 11:00
 */
@RestController
public class UserHystrixFeignController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/userId/{userId}")
    public User findByIdUser(@PathVariable Long userId){
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println(userId);
        return userFeignClient.findById(userId);
    }
}
