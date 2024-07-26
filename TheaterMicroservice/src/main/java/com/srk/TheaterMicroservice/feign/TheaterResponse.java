package com.srk.TheaterMicroservice.feign;

import com.srk.TheaterMicroservice.Model.Theater;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class TheaterResponse {
    public Theater theater;
    public List<Feedback> feedbacks;
}
