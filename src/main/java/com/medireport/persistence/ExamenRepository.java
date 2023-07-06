package com.medireport.persistence;

import com.medireport.domain.Exam;
import com.medireport.domain.repository.ExamRepository;
import com.medireport.persistence.crud.ExamenCrudRepository;
import com.medireport.persistence.entity.Examen;
import com.medireport.persistence.mapper.ExamMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class ExamenRepository implements ExamRepository {
    private ExamenCrudRepository examenCrudRepository;
    private ExamMapper mapper;

    //Listar tabla examenes
    @Override
    public List<Exam> getAll() {
        List<Examen> examenes = (List<Examen>) examenCrudRepository.findAll();
        return mapper.toExams(examenes);
    }

    @Override
    public Optional<Exam> getExam(int examId) {
        return examenCrudRepository.findById(examId).map(examen -> mapper.toExam(examen));
    }

    @Override
    public Exam save(Exam exam) {
        Examen examen= mapper.toExamen(exam);
        return mapper.toExam(examenCrudRepository.save(examen));
    }


}
