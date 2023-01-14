package com.sarje.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sarje.model.MyMail;

@RestController
public class SendMailController {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@PostMapping("/send_mail")
	public String sendMail(@RequestBody MyMail myMail) {
		System.out.println(myMail);
		SimpleMailMessage smm = new SimpleMailMessage();
		smm.setTo(myMail.getTo());
		smm.setFrom(myMail.getFrom());
		smm.setSubject(myMail.getSubject());
		smm.setText(myMail.getMsg());
		javaMailSender.send(smm);
		
		return "success";
	}
	
}