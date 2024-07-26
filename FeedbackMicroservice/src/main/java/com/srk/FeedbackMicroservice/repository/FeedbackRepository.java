package com.srk.FeedbackMicroservice.repository;

import com.srk.FeedbackMicroservice.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback,Integer> {
    List<Feedback> findByTid(int tid);
}
