package com.crud.springwithmongo.service;

import com.crud.springwithmongo.model.Movie;
import org.springframework.stereotype.Service;


public interface MovieService {
    void save(Movie movie);
}
