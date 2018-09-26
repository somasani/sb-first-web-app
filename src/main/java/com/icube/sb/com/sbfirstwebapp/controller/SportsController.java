package com.icube.sb.com.sbfirstwebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sports")
public class SportsController {
		
	@RequestMapping	(value="",method=RequestMethod.GET)
	public String sportsHomePage()	{
		return "Welcome to the world of Indian sports";
	}
	
	@RequestMapping	(value="/games",method=RequestMethod.GET)
	public String getGameInfo()	{
	   return "Displays all the Games";
	}
	
	@RequestMapping (value="/cricketInfo",method=RequestMethod.GET)
	public String getCricketInfo(){
		return "Display all the players of Cricket";
	}
	
	@RequestMapping (value="/rugbyInfo",method=RequestMethod.GET)
	public String getRugbyInfo()   
	{
		return "Display all the players of Rugby";
	}
	
	@RequestMapping (value="/footballInfo",method=RequestMethod.GET)
	public String getFootballInfo()
	{
		return "Display all the players of Football";
	}
	
	@RequestMapping (value="/hockeyInfo",method=RequestMethod.GET)
	public String getHockeyInfo()
	{
		return "Display all the Players of Hockey";
	}
    @RequestMapping (value="/handBall",method=RequestMethod.GET)
    public String getHandballInfo() 
    {
	return "Display all the players of HandBall";
    }
}



