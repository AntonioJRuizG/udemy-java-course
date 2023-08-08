package main.es.com.javacourse.movieapp.business;

import main.es.com.javacourse.movieapp.domain.Movie;
import main.es.com.javacourse.movieapp.exceptions.DataAccessEx;
import main.es.com.javacourse.movieapp.exceptions.ReadDataEx;
import main.es.com.javacourse.movieapp.exceptions.WriteDataEx;
import main.es.com.javacourse.movieapp.services.DataAccessImpl;

import java.util.List;

public class MovieListImpl implements IMovieList {
    DataAccessImpl dataAccess = new DataAccessImpl();
    Movie movie = new Movie();

    public MovieListImpl() {
        this.dataAccess = new DataAccessImpl();
    }

    @Override
    public void addMovie(String movieName, String fileName) throws WriteDataEx {
        movie.setName(movieName);
        dataAccess.write(movie, fileName, true);
    }

    @Override
    public void listMovies(String fileName) throws ReadDataEx {
        List<Movie> list = this.dataAccess.read(fileName);
        list.forEach(item -> System.out.println("Title: " + item.getName()));
        System.out.println("Showing list completed.");
    }

    @Override
    public void searchMovie(String fileName, String search) throws ReadDataEx {
        String searchResult = this.dataAccess.search(fileName, search);
        System.out.println("Search Result: " + searchResult);
    }

    @Override
    public void initFile(String fileName) throws DataAccessEx {
        this.dataAccess.create(fileName);
    }
}
