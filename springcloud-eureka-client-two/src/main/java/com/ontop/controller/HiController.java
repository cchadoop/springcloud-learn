package com.ontop.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@Value("${server.port}")
	private int port;
	
	@GetMapping("/hi")
	public String getHi() {
		return "hello,port:"+port;
	}
}
