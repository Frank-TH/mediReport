package com.medireport.persistence.mapper;

import com.medireport.domain.AttentionExam;
import com.medireport.persistence.entity.AtencionExamen;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {AttentionMapper.class, ExamMapper.class})
public interface AttentionExamMapper {

    @Mappings({
            @Mapping(source = "id.idExamen", target = "examenId"),
            @Mapping(source = "resultado", target = "result"),
            @Mapping(source = "comentario", target = "comment"),
    })
    AttentionExam toAttentionExam(AtencionExamen atencionExamen);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "atencion", ignore = true),
            @Mapping(target = "examen", ignore = true),
            @Mapping(target = "id.idAtencion", ignore = true),
    })
    AtencionExamen toAtencionExamen(AttentionExam attentionExam);

}
