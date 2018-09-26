package com.icube.sb.com.sbfirstwebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EventsController 
{ 
	@RequestMapping(value ="/") 
	public String setMethod()
	{
		return "Welcome to My World";
	}
	
}
	
	
		