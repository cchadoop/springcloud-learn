package com.ontop.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ontop.service.impl.SchedualServiceHiHystric;

@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

	@GetMapping("/hi")
	String sayHiFormClientOne(@RequestParam(value="name", defaultValue ="Spring Cloud")String name);
}
