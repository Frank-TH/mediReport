package com.medireport.persistence.mapper;

import com.medireport.domain.Attention;
import com.medireport.persistence.entity.Atencion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses={AttentionExamMapper.class})
public interface AttentionMapper {


    @Mappings({
            @Mapping(source = "id",target = "attentionId"),
            @Mapping(source = "idPaciente",target = "patientId"),
            @Mapping(source = "idAsesor",target = "adviserId"),
            @Mapping(source = "cantidadTiras",target = "quantity"),
            @Mapping(source = "fechaAtencion",target = "date"),
            @Mapping(source = "examenes",target = "exams"),
    })
    Attention toAttention(Atencion atencion);

    List<Attention> toAttentions(List<Atencion> atenciones);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "asesor",ignore = true),
            @Mapping(target = "paciente",ignore = true),
            @Mapping(target = "campanaMedica",ignore = true),
            @Mapping(target = "idCampana",ignore = true),
    })
    Atencion toAtencion(Attention attention);
}
