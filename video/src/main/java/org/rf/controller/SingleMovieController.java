package org.rf.controller;

import org.rf.model.Movie;
import org.rf.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SingleMovieController {
	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/b")
	public ModelAndView ShowSingleMovie(){
		ModelAndView mav=new ModelAndView("SingleMovie");
		mav.addObject("sm",movieService.selectMovieById(2));
		System.out.println("nihao");
		return mav;
	}
}

