package com.example.controller;

import com.example.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @GetMapping("/{movieId}")
    public Movie getMovie(@PathVariable final String movieId) {
        return new Movie("1", "don");
    }
}
