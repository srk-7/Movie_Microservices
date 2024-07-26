package com.srk.MovieMicroservice.Service;

import com.srk.MovieMicroservice.Model.Movie;
import com.srk.MovieMicroservice.Repository.MovieRepository;
import com.srk.MovieMicroservice.feign.FullResponse;
import com.srk.MovieMicroservice.feign.UserClient;
import com.srk.MovieMicroservice.feign.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    public MovieRepository repo;

    @Autowired
    public UserClient client;

    public Movie addMovie(Movie movie)
    {
        return repo.save(movie);
    }

    public List<Movie> getMovies()
    {
        return repo.findAll();
    }


    public FullResponse getbyMid(int mid) {
        Movie movie=repo.findByMid(mid);
        List<UserResponse> users= client.getUserByMid(mid);
        FullResponse fr = new FullResponse(movie, users);
        return fr;
    }
}