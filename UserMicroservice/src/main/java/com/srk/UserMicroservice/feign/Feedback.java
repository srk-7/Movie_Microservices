package com.srk.UserMicroservice.feign;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Feedback {
    public int fid;
    public String comment;
    public double rating;
    public int tid;
}