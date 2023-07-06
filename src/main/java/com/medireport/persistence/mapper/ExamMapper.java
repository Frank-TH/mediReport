package com.medireport.persistence.mapper;

import com.medireport.domain.Exam;
import com.medireport.persistence.entity.Examen;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExamMapper {

    @Mappings({
            @Mapping(source = "id", target = "examId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "costo", target = "cost"),
    })
    Exam toExam(Examen examen);

    List<Exam> toExams(List<Examen> examenes);

    @InheritInverseConfiguration
    Examen toExamen(Exam exam);
}
