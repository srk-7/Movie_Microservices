package com.srk.MovieMicroservice.feign;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserModel {
    public int uid;
    public String uname;
    public String email;
    public String password;
    public int mid;
}
