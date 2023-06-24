package com.example.demo.api;

import java.time.Duration;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.database.entity.Answer;
import com.example.demo.database.entity.Question;
import com.example.demo.services.QuestionService;

@RestController
@RequestMapping("/questions")
@CrossOrigin(origins = "http://localhost:4200")
public class QuestionController {

    @Autowired
   private QuestionService questionService;


    @PostMapping
    public Question createQuestion(@RequestBody Question question) {

       // System.out.println(questionService.createQuestion(question));
        question.setDisplayDuration(Duration.ofSeconds(question.getDisplayTime()));
      //  System.out.println(questionService.createQuestion(question));
        return questionService.createQuestion(question);
        
    }

    @GetMapping("/{id}")
    public Question findQuestion(@PathVariable String id) {
        return questionService.findQuestion(id);
    }

    @GetMapping
    public List<Question> findAllQuestions() {
        return questionService.findAllQuestions();
    }

    @DeleteMapping("/{id}")
    public String deleteQuestion(@PathVariable String id) {
       return questionService.deleteQuestion(id);
       
    }

    @PutMapping("/{id}")
    public Question addAnswer(@PathVariable String id,@RequestBody Answer answer){
        //if id exist

        return questionService.addAnswer(id, answer);
    }


    // @PutMapping("delete/{id}")
    // public Question deleteAnswer(@PathVariable String id, @RequestBody Answer answer) {
        
    //     return questionService.deleteAnswer(id,answer);

    // }



    
    
}