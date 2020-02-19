package com.crud.springwithmongo.controller;

import com.crud.springwithmongo.model.Movie;
import com.crud.springwithmongo.repository.MovieRepository;
import com.crud.springwithmongo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private MovieService movieService;

    @PostMapping("/save")
    public String save(@RequestBody Movie movie) {
        movieService.save(movie);
        return "Data Saved with id " + movie.toString();
    }
}
