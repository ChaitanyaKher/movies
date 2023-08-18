package com.mdb.movies.service;

import com.mdb.movies.model.Movie;
import com.mdb.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Chaitanya Kher
 * @created 18/08/2023 - 13:24
 * @project movies
 */

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findMovieByImdbId(String id) {
        return movieRepository.findMovieByImdbId(id);
    }
}
