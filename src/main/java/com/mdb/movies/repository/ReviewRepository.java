package com.mdb.movies.repository;

import com.mdb.movies.model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Chaitanya Kher
 * @created 18/08/2023 - 16:32
 * @project movies
 */
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
