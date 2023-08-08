package main.es.com.javacourse.movieapp.business;

import main.es.com.javacourse.movieapp.exceptions.DataAccessEx;
import main.es.com.javacourse.movieapp.exceptions.ReadDataEx;
import main.es.com.javacourse.movieapp.exceptions.WriteDataEx;

public interface IMovieList {
    public void addMovie(String movieName, String fileName) throws WriteDataEx;
    public void listMovies(String fileName) throws ReadDataEx;
    public void searchMovie(String fileName, String search) throws ReadDataEx;
    public void initFile(String fileName) throws DataAccessEx;
}
