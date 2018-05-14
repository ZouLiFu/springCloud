package com.lywx.userhystrixfeignlogger.feign;

import com.lywx.userhystrixfeignlogger.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author zoulifu
 * @version V1.0
 * @Description:
 * @date: 2018/5/10 11:08
 */
@FeignClient(name = "user-service-common",fallbackFactory = HystrixClientFactory.class)
public interface UserFeignClient {

    @RequestMapping(value = "/userId/{userId}", method = RequestMethod.GET)//不能用@GetMapping
    public User findById(@PathVariable("userId") Long userId);

}
