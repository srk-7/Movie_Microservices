package com.srk.UserMicroservice.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    @Id
    public int uid;
    public String uname;
    public String email;
    public String password;
    public int mid;
}