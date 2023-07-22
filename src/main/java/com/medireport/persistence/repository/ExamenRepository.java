package com.medireport.persistence.repository;

import com.medireport.domain.Exam;
import com.medireport.domain.repository.ExamRepository;
import com.medireport.persistence.crud.ExamenCrudRepository;
import com.medireport.persistence.entity.Examen;
import com.medireport.persistence.mapper.ExamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ExamenRepository implements ExamRepository {

    @Autowired
    private ExamenCrudRepository examenCrudRepository;

    @Autowired
    private ExamMapper mapper;

    @Override
    public List<Exam> getAll() {
        List<Examen> examenes = (List<Examen>) examenCrudRepository.findAll();
        return mapper.toExams(examenes);
    }

    @Override
    public Optional<List<Exam>> getScarceExams(int quantity) {
        Optional<List<Examen>> examenes = examenCrudRepository.findByStockLessThan(quantity);
        return examenes.map(exams -> mapper.toExams(exams));
    }

    @Override
    public Optional<Exam> getExam(int examId) {
        return examenCrudRepository.findById(examId).
                map(examen -> mapper.toExam(examen));
    }

    @Override
    public Exam newExam(Exam exam) {
        Examen examen = mapper.toExamen(exam);
        return mapper.toExam(examenCrudRepository.save(examen));
    }

    @Override
    public void delete(int examId) {
        examenCrudRepository.deleteById(examId);
    }

}
