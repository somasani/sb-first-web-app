package com.icube.sb.com.sbfirstwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/musicworld")//localhost:8080/musicworld => display value a funcion has to return a valaue
public class MusicController {
        
	@RequestMapping(value="",method=RequestMethod.GET)//localhost:8080/musicworld/music
	@ResponseBody
	public String home() {
	     return "Get into the music world";
	}
	
	@RequestMapping(value="/music",method=RequestMethod.GET)//localhost:8080/musicworld/music
	@ResponseBody
	public String getClassicMusic() {
	     return "List of all the Classic Music shows";
	}
	
	@RequestMapping(value="/westernMusic",method=RequestMethod.GET)
	@ResponseBody
	public String getWesternMusic() {
	    return "PLay all the Western Music";
	}
	
	@RequestMapping(value="/raps",method=RequestMethod.GET)
	@ResponseBody
	public String getRaps() {
		return "Play  all the Rap Songs";
	}
	
	@RequestMapping(value="/albums",method=RequestMethod.GET)
	@ResponseBody
	public String getAlbums(){
	    return "Play all the Albums";	
	}
	
	@RequestMapping (value="/devotional",method=RequestMethod.GET)
	@ResponseBody
	public String getdevotionalChannel(){
		return "Play all the  Devotional songs";
		
	}
	}
