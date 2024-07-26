package com.srk.MovieMicroservice.feign;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserResponse {
    public UserModel userModel;
    public List<TheaterResponse> theaterResponses;
}
