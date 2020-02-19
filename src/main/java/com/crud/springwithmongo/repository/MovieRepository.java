package com.crud.springwithmongo.repository;

import com.crud.springwithmongo.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie,Integer> {
}
