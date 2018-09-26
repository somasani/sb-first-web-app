package com.icube.sb.com.sbfirstwebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@RequestMapping (value="", method=RequestMethod.GET)
	public String getUsersList() {
		return "Get the Information of all the Users";
	}
	@RequestMapping (value="/useraccntnumber" ,method=RequestMethod.GET)
	public String getUserAccntNumber() {
		return "Get the User Accnt Number";
	}
	@RequestMapping (value="/username" ,method=RequestMethod.GET)
	public String getUserName() {
		return "Get the User Name";
	}
	@RequestMapping (value="/userdesignation" , method=RequestMethod.GET)
	public String getUserDesignation() {
		return "Get the User Desgnation ";
	}
	@RequestMapping (value="/userbankinfo",method=RequestMethod.GET)
	 public String getUserBankInfo() {
		return "Get all the User Bank Info";
	}
}
	
