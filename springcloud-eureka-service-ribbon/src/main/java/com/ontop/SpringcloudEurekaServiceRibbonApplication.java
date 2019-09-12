package com.ontop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class SpringcloudEurekaServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaServiceRibbonApplication.class, args);
	}
	
	@Bean
	@LoadBalanced //负载均衡
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
