package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.database.entity.ExamDefenition;
import com.example.demo.database.entity.Question;
import com.example.demo.database.repository.ExamDefenitionRepository;
import com.example.demo.services.ExamDefinitionService;


@RestController
@RequestMapping("/examDefinitions")
@CrossOrigin(origins = "http://localhost:4200")
public class ExamDefinitionController {
    @Autowired
    private ExamDefinitionService examDefenitionService;

    @PostMapping
    public ExamDefenition createExamDefenition(@RequestBody ExamDefenition examDefenition) {
        return examDefenitionService.creatExamDefenition(examDefenition);
    }
    
    @GetMapping
    public List<ExamDefenition> getExamDefenition() {
       return examDefenitionService.findAllExamDefinitions();
    }

    @DeleteMapping("/{id}")
    public String deleteQuestion(@PathVariable String id) {
       return examDefenitionService.deleteExamDefinition(id);
       
    }

    @GetMapping("/{id}")
    public ExamDefenition findExamDefenition(@PathVariable String id) {
        return examDefenitionService.findExamDefinition(id);
    }

    
}