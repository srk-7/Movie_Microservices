package com.srk.TheaterMicroservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="feedback", url="http://localhost:8081")
public interface FeedbackClient {

    @GetMapping("/feedbacks/theatre/{tid}")
    List<Feedback> getFeedbacksByTid(@PathVariable int tid);

}