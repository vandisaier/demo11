package com.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hihiController {

	@RequestMapping("/hi")
	public String hello() {
		return "你在干什么";
	}
}
