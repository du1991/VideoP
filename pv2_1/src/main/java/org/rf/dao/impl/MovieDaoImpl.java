package org.rf.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.rf.dao.MovieDao;
import org.rf.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl implements MovieDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Movie> selectMovies() {
		String sql="select * from movies";
		return jdbcTemplate.query(sql, new RowMapper<Movie>(){
			public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
				Movie movie=new Movie(rs.getInt(1),rs.getString(2)
						,rs.getString(3),rs.getString(4),rs.getString(5));
				return movie;
			}
			});
	}

	
	public Movie selectMovieById(int id){  
		String sql ="select * from movies where id ="+id; 
		final Movie movie=new Movie();
		jdbcTemplate.query(sql, new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				movie.setId(rs.getInt(1));
				movie.setName(rs.getString(2));
				movie.setPublisher(rs.getString(3));
				movie.setPublishtime(rs.getString(4));
				movie.setMovietype(rs.getString(5));
		}
		});
        return movie;  
    }   
          
	public int insertMovie(Movie mo){
		String sql ="insert into movies (name,publisher,publishtime,movietype) values(?,?,?,?)";
		return jdbcTemplate.update(sql, new Object [] {mo.getName(),mo.getPublisher(),mo.getPublishtime(),mo.getMovietype()});
	}
	
	public int updateMovie(Movie mo){
		String sql = "update movies set name = ?,publisher = ?,publishtime = ?,movietype = ? where id = ?";
		return jdbcTemplate.update(sql, mo.getName(),mo.getPublisher(),mo.getPublishtime(),mo.getMovietype(),mo.getId());
	}
	
	public int deleteMovieById(int id){
		String sql = "delete from movies where id = ?";
		return jdbcTemplate.update(sql, id);
	}
}
