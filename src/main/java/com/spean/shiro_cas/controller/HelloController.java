package com.spean.shiro_cas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("hello")
	public Object sayHi() {
		return "hello now:"+System.currentTimeMillis();
	}
	
}
