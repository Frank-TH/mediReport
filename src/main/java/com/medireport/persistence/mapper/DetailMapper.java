package com.medireport.persistence.mapper;

import com.medireport.domain.Detail;
import com.medireport.persistence.entity.Detalle;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ExamMapper.class})
public interface DetailMapper {
    @Mappings({
            @Mapping(source = "id.examenId", target = "examId"),
            @Mapping(source = "resultado", target = "result"),
            @Mapping(source = "comentario", target = "comment")
    })
    Detail toDetail(Detalle examen);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "pedido", ignore = true),
            @Mapping(target = "examen", ignore = true),
            @Mapping(target = "id.pedidoId", ignore = true)
    })
    Detalle toDetalle(Detail detail);

}
