package com.srk.TheaterMicroservice.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="theatres")
public class Theater {
    @Id
    public int tid;
    public String tname;
    public String location;
    public int uid;
}
