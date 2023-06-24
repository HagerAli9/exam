package com.example.demo.database.repository;

import com.example.demo.database.entity.ExamInstance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamInstanceRepository extends MongoRepository<ExamInstance, String> {
    
}