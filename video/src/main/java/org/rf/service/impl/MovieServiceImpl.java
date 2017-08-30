package org.rf.service.impl;

import java.util.List;

import org.rf.dao.MovieDao;
import org.rf.model.Movie;
import org.rf.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieDao moviedao;

	public List<Movie> selectMovies() {
		return moviedao.selectMovies();
	}
	
	public Movie selectMovieById(int id){
		return moviedao.selectMovieById(id);
	}
}
