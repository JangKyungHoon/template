package com.template.app.controller;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.template.app.service.HelloService;

@Controller("helloController")
public class HelloController {
	Logger logger = Logger.getLogger(HelloController.class);
	
	@Autowired
	private HelloService helloService;
	
	@Autowired
	private MessageSource messageSource;
	
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Locale locale) {
		logger.info("call index : " + messageSource.getMessage("title", null, locale));
		
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
