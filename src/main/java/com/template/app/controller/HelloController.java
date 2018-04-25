package com.template.app.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.template.app.service.HelloService;

@Controller
public class HelloController {
	Logger logger = Logger.getLogger(HelloController.class);
	
	@Autowired
	private HelloService helloService;
	
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		logger.info("connect index");
		return "home";
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		logger.info(helloService.hello());
		
		return "home";
	}
	
	@RequestMapping(value="/admin/index", method=RequestMethod.GET)
	public String admin() {
		logger.info("admin page");
		
		return "admin/admin";
	}
}
