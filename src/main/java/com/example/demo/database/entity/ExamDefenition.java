package com.example.demo.database.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection="examDefenition")
public class ExamDefenition {
    @Id
    String _id;
    String name;
    int passingScore;
   // @DBRef
    String[] questionsIds;
    @Transient
    Question[] questions;
    String createdBy;
    // @DBRef
    // Instructor createdBy; 
    int duration;
    // public int getDuration(){

    //      for(int i = 0 ; i < questions.length ; i++){

    //         duration+=questions[i].displayTime;

    //     }
    //   return duration;

    // }
   
}