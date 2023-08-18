package com.mdb.movies.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Chaitanya Kher
 * @created 18/08/2023 - 13:16
 * @project movies
 */

@Document(collection = "reviews")
public class Review {
    @Id
    private ObjectId id;

    private String body;

    public Review(String body) {
        this.body = body;
    }
}
