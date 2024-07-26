package com.srk.UserMicroservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="TheaterMicroservice", url="http://localhost:8082")
public interface TheatreClient {

    @GetMapping("/theatres/user/{uid}")
    public List<TheaterResponse> getTheatrebyUid(@PathVariable int uid);
}
