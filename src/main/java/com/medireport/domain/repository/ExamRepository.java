package com.medireport.domain.repository;


import com.medireport.domain.Exam;

import java.util.List;
import java.util.Optional;

public interface ExamRepository {

    List<Exam> getAll();
    Optional<Exam> getExam(int examId);
    Exam save(Exam exam);
    void delete (int examId);
}
