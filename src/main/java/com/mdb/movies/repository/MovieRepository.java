package com.mdb.movies.repository;

import com.mdb.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Chaitanya Kher
 * @created 18/08/2023 - 13:24
 * @project movies
 */

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByImdbId(String Id);
}
