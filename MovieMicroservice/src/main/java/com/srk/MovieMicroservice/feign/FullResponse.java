package com.srk.MovieMicroservice.feign;

import com.srk.MovieMicroservice.Model.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class FullResponse {
    public Movie movie;
    public List<UserResponse> userResponse;
}