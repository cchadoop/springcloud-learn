package com.ontop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ontop.service.HelloService;

@RestController
public class HelloController {
	@Autowired
	HelloService helloService;
	
	@GetMapping(value="/hi")
	//Hystrix 容错管理组件，实现了熔断器
	@HystrixCommand(fallbackMethod="hiError")
	public String hi(@RequestParam String name) {
		return helloService.hiService(name);
	}
	
	public String hiError(String name) {
		return "hi,"+name+",sorry,error!";
	}
}
