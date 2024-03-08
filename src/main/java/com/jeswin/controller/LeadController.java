package com.jeswin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeswin.entity.Lead;
import com.jeswin.service.LeadService;
import com.jeswin.utility.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadServ;
	@Autowired
	private EmailService emailServ;
	@RequestMapping("/jeswin")
	public String home() {
		return "index";
	}
	
	
	@RequestMapping("/saveleadinfo")
	public void saveleadinfo(Lead lead) {
		leadServ.saveLeaddata(lead);
		emailServ.emailmessage(lead.getEmail(),"message recieved","your message has been recieved thank you");
	
		
	}

}
