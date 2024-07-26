package com.srk.UserMicroservice.feign;

import com.srk.UserMicroservice.Model.UserModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserResponse {
    public UserModel userModel;
    public List<TheaterResponse> theaterResponses;
}
