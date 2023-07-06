package com.medireport.persistence.mapper;

import com.medireport.domain.Exam;
import com.medireport.persistence.entity.Examen;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExamMapper {

    @Mappings({
            @Mapping(source = "id", target = "examId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "costo", target = "cost"),
    })
    Exam toExam(Examen examen);

    List<Exam> toExams(List<Examen> exams);

    @InheritConfiguration
    Examen toExamen(Exam exam);
}
