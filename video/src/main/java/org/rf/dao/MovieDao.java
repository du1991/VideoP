package org.rf.dao;

import java.util.List;

import org.rf.model.Movie;

public interface MovieDao {
	
	public List<Movie> selectMovies();
	
	public Movie selectMovieById(int id);
	
	public int insertMovie(Movie mo);
	
	public int updateMovie(Movie mo);
	
	public int deleteMovieById(int id);
}
