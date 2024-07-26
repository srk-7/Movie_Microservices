package com.srk.UserMicroservice.feign;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Theater {
    public int tid;
    public String tname;
    public String location;
    public int uid;
}