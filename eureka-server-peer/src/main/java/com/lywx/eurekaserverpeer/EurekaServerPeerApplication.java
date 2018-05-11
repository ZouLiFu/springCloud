package com.lywx.eurekaserverpeer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerPeerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerPeerApplication.class, args);
	}
}
