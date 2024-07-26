package com.srk.MovieMicroservice.Repository;

import com.srk.MovieMicroservice.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    Movie findByMid(int mid);
}