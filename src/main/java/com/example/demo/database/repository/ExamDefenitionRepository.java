package com.example.demo.database.repository;
import com.example.demo.database.entity.ExamDefenition;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamDefenitionRepository extends MongoRepository<ExamDefenition, String> {
    
}