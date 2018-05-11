package com.lywx.ribbonclient;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zoulifu
 * @version V1.0
 * @Description:第一种写法：自定义ribbon负载为随机请求,这种写法要把TestConfiguration放到外面
 * 如果放到RibbonClientApplication同级的话，所有的请求都是我们下面定义的请求方式了
 * @date: 2018/5/9 15:27
 */
@Configuration
@ExcludeFromComponentScan  //在RibbonClientApplication同级需要加这个注解，并指明ExcludeFromComponentScan路径
public class TestConfiguration {

    /*@Autowired
    IClientConfig config;*/

    @Bean
    public IRule ribbonIRule(){
        return new RandomRule();
    }
}
