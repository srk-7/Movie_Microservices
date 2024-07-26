package com.srk.MovieMicroservice.feign;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Feedback {
    public int fid;
    public String comment;
    public double rating;
    public int tid;
}
