package com.srk.UserMicroservice.Service;

import com.srk.UserMicroservice.Model.UserModel;
import com.srk.UserMicroservice.Repository.UserRepository;
import com.srk.UserMicroservice.feign.TheaterResponse;
import com.srk.UserMicroservice.feign.TheatreClient;
import com.srk.UserMicroservice.feign.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserRepository repo;

    @Autowired
    public TheatreClient client;

    public UserModel addUser(UserModel userModel)
    {
        return repo.save(userModel);
    }

    public List<UserModel> getAllUsers()
    {
        return repo.findAll();
    }

    public List<UserResponse> getUserByMid(int mid)
    {
        List<UserModel> users = repo.findByMid(mid);
        List<UserResponse> userResponses = new ArrayList<>();
        for(UserModel user: users){
            List<TheaterResponse> theaterResponse = client.getTheatrebyUid(user.getUid());
            UserResponse userResponse= new UserResponse();
            userResponse.setUserModel(user);
            userResponse.setTheaterResponses(theaterResponse);
            userResponses.add(userResponse);
        }
        return userResponses;
    }
}
