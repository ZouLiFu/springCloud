package com.lywx.userhystrixfeign.feign;

import com.lywx.userhystrixfeign.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author zoulifu
 * @version V1.0
 * @Description:声明访问服务的接口第一种运用默认的
 * @date: 2018/5/10 11:08
 */
/*@FeignClient("user-service-ribbon")
public interface UserFeignClient {
    @GetMapping("/userId/{userId}")
    public User findById(@PathVariable("userId") Long userId);

}*/

/**
 * @author zoulifu
 * @version V1.0
 * @Description:声明访问服务的接口第二种自定义
 * @date: 2018/5/10 11:08
 */
@FeignClient(name = "user-service-common",fallback = HiHystrixFallback.class)
public interface UserFeignClient {
    @GetMapping("/userId/{userId}")
    public User findById(@RequestParam(value = "userId") Long userId);

}
