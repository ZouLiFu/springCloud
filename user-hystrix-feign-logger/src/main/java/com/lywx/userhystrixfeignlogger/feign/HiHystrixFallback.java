package com.lywx.userhystrixfeignlogger.feign;


import com.lywx.userhystrixfeignlogger.entity.User;

/**
 * @author zoulifu
 * @version V1.0
 * @Description:
 * @date: 2018/5/11 17:58
 */
public class HiHystrixFallback implements UserFeignClient {
    @Override
    public User findById(Long userId) {
        User user = new User();
        user.setUserId(-1L);
        return user;
    }
}
