package org.rf.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.rf.model.Movie;
import org.rf.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MoviesController{
	
	@Autowired
	private MovieService movieService; 

	@RequestMapping("/a")
	public ModelAndView ShowMovies(){ 
		ModelAndView mav=new ModelAndView("SingleMovie");
		mav.addObject("sm",movieService.selectMovies());	
		return mav;
	}
}
