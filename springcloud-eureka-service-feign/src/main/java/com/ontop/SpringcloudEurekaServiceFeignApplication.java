package com.ontop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
 * Feign
 * 整合了 Ribbon，具有负载均衡的能力，
 * 整合了Hystrix，具有熔断的能力
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringcloudEurekaServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaServiceFeignApplication.class, args);
	}

}
