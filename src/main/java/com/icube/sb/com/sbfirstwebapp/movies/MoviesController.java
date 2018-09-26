package com.icube.sb.com.sbfirstwebapp.movies;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {
	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/movies")
	public List<MovieItem> getAllMovies() {
		return movieService.getAllMovies();
		
	}
	
	@RequestMapping("/movies/{language}")
	public MovieItem getMovie(@PathVariable String language) {
		return movieService.getMovie(language);    
		
	}
	
	@RequestMapping("/movies/{title}")
	public MovieItem getMovieByTitle(@PathVariable String title) {
		return movieService.getMovieTitle(title);    
		
	}
	
	
	
}
