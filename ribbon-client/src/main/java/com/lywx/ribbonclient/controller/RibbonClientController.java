package com.lywx.ribbonclient.controller;

import com.lywx.ribbonclient.entity.User;
import com.lywx.ribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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
public class RibbonClientController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    RibbonService ribbonServer;


    @GetMapping("/user/{userId}")
    public User findById(@PathVariable Long userId){
        ServiceInstance serviceInstance =  this.loadBalancerClient.choose("user-service");
        System.out.println(serviceInstance.getHost() +":"+ serviceInstance.getPort()+":"+ serviceInstance.getServiceId());
        //System.out.println();
        return this.restTemplate.getForObject("http://user-service/show?userId="+userId,User.class);
    }

    @GetMapping("/userId/{userId}")
    public User findByIdUser(@PathVariable Long userId){
        ServiceInstance serviceInstance =  this.loadBalancerClient.choose("user-service");
        System.out.println(serviceInstance.getHost() +":"+ serviceInstance.getPort()+":"+ serviceInstance.getServiceId());
        return ribbonServer.findById(userId);
    }

    /**
     * user-service 实现自定义随机选取服务
     * user-service-ribbon 实现轮巡服务
     * @return
     */
    @GetMapping("/ribbon/{userId}")
    public String RibbonUserService(){
        ServiceInstance serviceInstance =  this.loadBalancerClient.choose("user-service");
        System.out.println(serviceInstance.getHost() +":"+ serviceInstance.getPort()+":"+ serviceInstance.getServiceId());

        ServiceInstance serviceInstance2 =  this.loadBalancerClient.choose("user-service-ribbon");
        System.out.println(serviceInstance2.getHost() +":"+ serviceInstance2.getPort()+":"+ serviceInstance2.getServiceId());
        return "1";
    }
}
