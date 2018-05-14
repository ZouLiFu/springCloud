package com.lywx.userhystrixfeign.feign;

import com.lywx.userhystrixfeign.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zoulifu
 * @version V1.0
 * @Description:
 * @date: 2018/5/11 17:58
 */
@Component
public class HiHystrixFallback implements UserFeignClient {
    @Override
    public User findById(@RequestParam(value = "userId") Long userId) {
        User user = new User();
        user.setUserId(-1L);
        return user;
    }
}
