package com.lywx.userhystrixfeignlogger.feign;

import com.lywx.userhystrixfeignlogger.entity.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author zoulifu
 * @version V1.0
 * @Description:
 * @date: 2018/5/11 18:50
 */
@Component
public class HystrixClientFactory implements FallbackFactory<UserFeignClient> {
    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFactory.class);
    @Override
    public UserFeignClient create(Throwable throwable) {
        HystrixClientFactory.LOGGER.info("fallback;reason was:{}",throwable.getMessage());
        return new UserFeignClientWithFactory() {
            @Override
            public User findById(Long userId) {
                User user = new User();
                user.setUserId(-2L);
                return user;
            }
        };
    }
}
