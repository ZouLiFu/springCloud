package com.lywx.config;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zoulifu
 * @version V1.0
 * @Description:
 * @date: 2018/5/10 12:22
 */
@Configuration
public class Configuration1 {
    @Bean
    public Contract feignContract(){
        return new Contract.Default();
    }

    /**
     * 配置日志管理
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
