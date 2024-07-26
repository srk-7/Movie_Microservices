package com.srk.MovieMicroservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="UserMicroservice", url="http://localhost:8083")
public interface UserClient {
    @GetMapping("/user/getUserByMid/{mid}")
    public List<UserResponse> getUserByMid(@PathVariable int mid);
}