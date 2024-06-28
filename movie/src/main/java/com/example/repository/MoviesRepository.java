package com.example.repository;

import com.example.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MoviesRepository extends JpaRepository<Movie, Long> {
    Movie save(Movie movie);

    List<Movie> findAll();

    default Optional<Movie> findById(Long id) {
        return null;
    }
}