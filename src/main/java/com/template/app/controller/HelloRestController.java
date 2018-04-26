package com.template.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloRestController {
	@RequestMapping("/hello")
	public Map<String, Object> sayHello() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "zkh");
		map.put("job", "dev");
		
		return map;
	}
}
