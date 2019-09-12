package com.ontop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ontop.service.SchedualServiceHi;

@RestController
public class HiController {
	
	@Autowired
	SchedualServiceHi schedualServiceHi;
	
	@GetMapping("/hi")
	public String sayHiFormClientOne(@RequestParam(value="name")String name) {
		return schedualServiceHi.sayHiFormClientOne(name);
	}
}
