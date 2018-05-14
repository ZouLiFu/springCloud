package com.lywx.turbinehystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine //开启Turbine
public class TurbineHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineHystrixApplication.class, args);
	}
}
