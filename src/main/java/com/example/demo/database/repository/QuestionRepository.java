package com.example.demo.database.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.database.entity.Question;

@Repository
public interface QuestionRepository extends MongoRepository<Question,String> {
    
}