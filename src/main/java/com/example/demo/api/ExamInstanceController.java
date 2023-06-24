package com.example.demo.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.database.entity.ExamDefenition;
import com.example.demo.database.entity.ExamInstance;
import com.example.demo.services.ExamInstanceService;

@RestController
@RequestMapping("/examInstances")
@CrossOrigin(origins = "http://localhost:4200")
public class ExamInstanceController {
  
    @Autowired
   private ExamInstanceService examInstanceService;

  @PostMapping
    public ExamInstance createExamDefenition(@RequestBody ExamInstance examDefenition) {
        return examInstanceService.createExamInstance(examDefenition);
    }
    
    
    @GetMapping
    public List<ExamInstance> getExamDefenition() {
       return examInstanceService.findAllExamInstances();
    }


    @GetMapping("/{id}")
    public ExamInstance findExamInstance(@PathVariable String id) {
        return examInstanceService.findExamInstance(id);
    }

    
    
}