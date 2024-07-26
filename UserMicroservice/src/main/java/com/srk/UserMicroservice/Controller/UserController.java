package com.srk.UserMicroservice.Controller;

import com.srk.UserMicroservice.Model.UserModel;
import com.srk.UserMicroservice.Service.UserService;
import com.srk.UserMicroservice.feign.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService service;

    @PostMapping("/addUser")
    public UserModel addUser(@RequestBody UserModel userModel)
    {
        return service.addUser(userModel);
    }

    @GetMapping("/getAllUsers")
    public List<UserModel> getAllUsers()
    {
        return service.getAllUsers();
    }

    @GetMapping("/getUserByMid/{mid}")
    public List<UserResponse> getUserByMid(@PathVariable int mid)
    {
        return service.getUserByMid(mid);
    }

}