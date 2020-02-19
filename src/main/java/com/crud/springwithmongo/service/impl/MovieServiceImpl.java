package com.crud.springwithmongo.service.impl;

import com.crud.springwithmongo.model.Movie;
import com.crud.springwithmongo.repository.MovieRepository;
import com.crud.springwithmongo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;
    @Override
    public void save(Movie movie) {
        movieRepository.save(movie);

    }
}
