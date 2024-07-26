package com.srk.FeedbackMicroservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="feedbacks")
public class Feedback {
    @Id
    public int fid;
    public String comment;
    public double rating;
    public int tid;
}
