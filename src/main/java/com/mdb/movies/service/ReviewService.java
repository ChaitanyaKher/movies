package com.mdb.movies.service;

import com.mdb.movies.model.Movie;
import com.mdb.movies.model.Review;
import com.mdb.movies.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

/**
 * @author Chaitanya Kher
 * @created 18/08/2023 - 16:35
 * @project movies
 */

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate;
    public Review createReview(String reviewBody, String id) {
        Review review = reviewRepository.insert(new Review(reviewBody));

        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(id))
                .apply(new Update().push("reviewIds").value(review))
                .first();
        return review;
    }
}
