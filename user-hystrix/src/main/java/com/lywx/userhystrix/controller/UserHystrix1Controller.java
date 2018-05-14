package com.lywx.userhystrix.controller;

/**
 * @author zoulifu
 * @version V1.0
 * @Description:
 * @date: 2018/5/9 10:21
 */
//@RestController
//@SessionScope
public class UserHystrix1Controller {

   /* @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/userId/{userId}")
    @HystrixCommand(fallbackMethod = "findByIdFallback",commandProperties = @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE"))
    public User findById(@PathVariable Long userId){
        return this.restTemplate.getForObject("http://user-service-common/userId/" + userId,User.class);
    }

    *//**
     * 熔断的方法名是fallbackMethod配置的方法名，必须与请求的方法一样
     * 请求的方法传递了参数，所以也要传递参数，这种方式的配置findById和fallbackMethod是一个线程完成
     * commandProperties一般情况下都不用配置这个，推荐抛异常的时候在配置
     * @param userId
     * @return
     *//*
    public User findByIdFallback(Long userId){
        User user = new User();
        user.setUserId(0L);
        return user;
}*/
}
