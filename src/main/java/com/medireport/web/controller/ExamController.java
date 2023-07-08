package com.medireport.web.controller;

import com.medireport.domain.Exam;
import com.medireport.domain.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exams")
public class ExamController {
    @Autowired
    private ExamService examService;

    @GetMapping("/all")
    public ResponseEntity<List<Exam>> getAll() {
        return new ResponseEntity<>(examService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exam> getExam(@PathVariable("id") int examId) {
        return examService.getExam(examId).
                map(exam -> new ResponseEntity<>(exam, HttpStatus.OK)).
                orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Exam> save(@RequestBody Exam exam) {
        return new ResponseEntity<>(examService.save(exam), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int examId) {
        if (examService.delete(examId)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
