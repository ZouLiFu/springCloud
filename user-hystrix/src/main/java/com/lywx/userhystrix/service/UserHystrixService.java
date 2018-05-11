package com.lywx.userhystrix.service;

import com.lywx.userhystrix.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zoulifu
 * @version V1.0
 * @Description:
 * @date: 2018/5/9 14:26
 */
@Service
public class UserHystrixService {
    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long userId){
        return this.restTemplate.getForObject("http://user-service/show?userId="+userId,User.class);
    }
}
