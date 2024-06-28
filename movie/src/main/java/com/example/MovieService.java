package com.example;

import com.example.model.Movie;
import com.example.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MoviesRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElseThrow();
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}


