package com.srk.TheaterMicroservice.Repository;

import com.srk.TheaterMicroservice.Model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TheatreRepository extends JpaRepository<Theater,Integer> {
    List<Theater> findByUid(int uid);
}
