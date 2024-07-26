package com.srk.FeedbackMicroservice.service;

import com.srk.FeedbackMicroservice.model.Feedback;
import com.srk.FeedbackMicroservice.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository repo;


    public List<Feedback> addFeedbacks(List<Feedback> feedbacks) {
        return repo.saveAll(feedbacks);
    }

    public List<Feedback> getFeedbacksByTid(int tid) {
        return repo.findByTid(tid);
    }
}
