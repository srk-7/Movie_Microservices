package com.srk.MovieMicroservice.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Movie {
    @Id
    public int mid;
    public String mname;
    public String director;
    public int year;
}