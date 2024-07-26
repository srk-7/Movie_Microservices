package com.srk.UserMicroservice.Repository;

import com.srk.UserMicroservice.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
    List<UserModel> findByMid(int mid);
}