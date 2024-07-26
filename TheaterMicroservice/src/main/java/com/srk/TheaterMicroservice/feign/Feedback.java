package com.srk.TheaterMicroservice.feign;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Feedback {
    public int fid;
    public String comment;
    public double rating;
    public int tid;
}
