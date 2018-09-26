package com.icube.sb.com.sbfirstwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/tvshows")
class TVShowsController {
	@RequestMapping(value="",method=RequestMethod.GET)
	@ResponseBody
	public String getRealityShow() {
	    return "List of all the Reality shows";
	}

	@RequestMapping(value="/kidsshows",method=RequestMethod.GET)
	@ResponseBody
	public String getKidsShows() {
	     return "Show all the Kids shows";
	}
	
	@RequestMapping(value="/newsreports",method=RequestMethod.GET)
	@ResponseBody
	public String getNewsReports() {
		 return "Show  all the News Reports";
	}
	
	@RequestMapping(value="/sport-tv",method=RequestMethod.GET)
	@ResponseBody
	public String getSports(){
	    return "Show all the sportschannels";	
	}
	
	@RequestMapping (value="/d",method=RequestMethod.GET)
	@ResponseBody
	public String devotionalChannel(){
		return "Show Devotional Channels";
		
	}
}
