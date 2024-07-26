package com.srk.TheaterMicroservice.Service;

import com.srk.TheaterMicroservice.Controller.TheatreController;
import com.srk.TheaterMicroservice.Model.Theater;
import com.srk.TheaterMicroservice.Repository.TheatreRepository;
import com.srk.TheaterMicroservice.feign.Feedback;
import com.srk.TheaterMicroservice.feign.FeedbackClient;
import com.srk.TheaterMicroservice.feign.TheaterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheaterService {

    @Autowired
    public TheatreRepository repo;

    @Autowired
    public FeedbackClient client;

    public List<Theater> addTheaters(List<Theater> theaters) {
        return repo.saveAll(theaters);
    }

    public List<TheaterResponse> getTheatrebyUid(int uid) {
        List<Theater> theaters= repo.findByUid(uid);
        List<TheaterResponse> responses= new ArrayList<>();
        for(Theater theater: theaters){
            List<Feedback> feedbacks= client.getFeedbacksByTid(theater.getTid());
            TheaterResponse response= new TheaterResponse();
            response.setTheater(theater);
            response.setFeedbacks(feedbacks);
            responses.add(response);
        }
        return responses;
    }
}
