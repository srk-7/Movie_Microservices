package com.srk.FeedbackMicroservice.controller;

import com.srk.FeedbackMicroservice.model.Feedback;
import com.srk.FeedbackMicroservice.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping("/add-feedbacks")
    public List<Feedback> addFeedbacks(@RequestBody List<Feedback> feedbacks){
        return feedbackService.addFeedbacks(feedbacks);
    }

    @GetMapping("/theatre/{tid}")
    public List<Feedback> getFeedbacksByTid(@PathVariable int tid){
        return feedbackService.getFeedbacksByTid(tid);
    }

}
