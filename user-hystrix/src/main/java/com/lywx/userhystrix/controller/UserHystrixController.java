package com.lywx.userhystrix.controller;

import com.lywx.userhystrix.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zoulifu
 * @version V1.0
 * @Description:
 * @date: 2018/5/9 10:21
 */
@RestController
public class UserHystrixController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{userId}")
    @HystrixCommand(fallbackMethod = "findByIdFallback")
    public User findById(@PathVariable Long userId){
        return this.restTemplate.getForObject("http://user-service-common/userId/" + userId,User.class);
    }

    /**
     * 熔断的方法名是fallbackMethod配置的方法名，必须与请求的方法一样
     * 请求的方法传递了参数，所以也要传递参数，这种方式的配置findById是一个线程
     * fallbackMethod是一个隔离的线程
     * @param userId
     * @return
     */
    public User findByIdFallback(Long userId){
        User user = new User();
        user.setUserId(0L);
        return user;
}
}
