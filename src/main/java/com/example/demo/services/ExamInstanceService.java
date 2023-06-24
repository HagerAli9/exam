package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.database.entity.ExamDefenition;
import com.example.demo.database.entity.ExamInstance;
import com.example.demo.database.repository.ExamInstanceRepository;

@Service
public class ExamInstanceService {
    @Autowired
    private ExamInstanceRepository examInstanceRepository;


    public ExamInstance createExamInstance(ExamInstance examInstance){
        return examInstanceRepository.save(examInstance);
    }

   public List<ExamInstance> findAllExamInstances() {
      return examInstanceRepository.findAll();
   }

    public ExamInstance findExamInstance(String id) {
       return  examInstanceRepository.findById(id).orElseThrow(() -> new NoSuchElementException(
               String.format(
                       "question with id [%d] was not found!",
                       id)));
    }
    
}