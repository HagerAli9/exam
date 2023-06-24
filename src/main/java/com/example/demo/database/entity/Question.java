package com.example.demo.database.entity;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection="question")
public class Question {
    @Id
    String _id;
    String name;
    String level_id;
    String category;
    int displayTime;
    int mark;
    Duration displayDuration=Duration.ofSeconds(displayTime);
    int[] correct_answer_ids;
    @DBRef
    Instructor created_by;
    //instructor created_by;
    LocalDateTime created_at;
   List< Answer> answers;

  public List< Answer> addAnswer(Answer answer){
    this.answers.add(answer);
    System.out.println("aded");
    return answers;
   }
   
  public List<Answer> deleteAnswer(Answer answer) {
       this.answers.remove(answer);
       return answers;
   }
   



    
}