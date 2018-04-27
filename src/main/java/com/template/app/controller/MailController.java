package com.template.app.controller;

import java.nio.charset.StandardCharsets;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("mailController")
@RequestMapping("/mail")
public class MailController {
	Logger logger = Logger.getLogger(MailController.class);
	
	@Autowired
	public JavaMailSender mailSender;
	
	/**
	 * gmail smtp
	 * https://myaccount.google.com/lesssecureapps
	 * 보안 낮음 설정
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("/send")
	public String sendMail(HttpServletRequest request) {
		try {
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, StandardCharsets.UTF_8.name());
			
			messageHelper.setFrom("sosiziya@gmail.com");
			messageHelper.setTo("sosiziya@naver.com");
			messageHelper.setSubject("mail title...");
			messageHelper.setText("mail content...");
			
			mailSender.send(message);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return "redirect:/home";
	}
}
