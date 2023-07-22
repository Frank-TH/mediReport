package com.medireport.domain.repository;


import com.medireport.domain.Exam;

import java.util.List;
import java.util.Optional;

public interface ExamRepository {

    List<Exam> getAll();
    Optional<List<Exam>> getScarceExams(int quatity);
    Optional<Exam> getExam(int examId);
    Exam newExam(Exam exam);
    void delete (int examId);
}
