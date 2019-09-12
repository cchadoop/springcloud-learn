package com.ontop.service.impl;

import org.springframework.stereotype.Component;

import com.ontop.service.SchedualServiceHi;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

	@Override
	public String sayHiFormClientOne(String name) {
		return "sorry"+name;
	}

}
