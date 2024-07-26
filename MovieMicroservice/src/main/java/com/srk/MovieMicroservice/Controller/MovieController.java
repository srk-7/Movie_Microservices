package com.srk.MovieMicroservice.Controller;

import com.srk.MovieMicroservice.Model.Movie;
import com.srk.MovieMicroservice.Service.MovieService;
import com.srk.MovieMicroservice.feign.FullResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    public MovieService service;

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie)
    {
        return service.addMovie(movie);
    }

    @GetMapping("/getAllMovies")
    public List<Movie> getAllMovies()
    {
        return service.getMovies();
    }

    @GetMapping("/getbyMid/{mid}")
    public FullResponse getbyMid(@PathVariable int mid)
    {
        return service.getbyMid(mid);
    }
}
