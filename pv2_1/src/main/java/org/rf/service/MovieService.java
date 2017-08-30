package org.rf.service;

import java.util.List;

import org.rf.model.Movie;

public interface MovieService {
	
	public List<Movie> selectMovies();
	
	public Movie selectMovieById(int id);
}
