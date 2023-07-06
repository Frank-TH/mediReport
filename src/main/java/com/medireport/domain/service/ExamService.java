package com.medireport.domain.service;

import com.medireport.domain.Exam;
import com.medireport.domain.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamService {
    @Autowired
    private ExamRepository examRepository;

    public List<Exam> getAll() {
        return examRepository.getAll();
    }

    public Optional<Exam> getExam(int examId) {
        return examRepository.getExam(examId);
    }

    public Exam save(Exam exam) {
        return examRepository.save(exam);
    }

    public boolean delete(int examId) {
        return getExam(examId).map(exam -> {
            examRepository.delete(examId);
            return true;
        }).orElse(false);
    }

}
