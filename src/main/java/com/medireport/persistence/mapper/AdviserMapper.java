package com.medireport.persistence.mapper;

import com.medireport.domain.Adviser;
import com.medireport.persistence.entity.Asesor;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface AdviserMapper {

    @Mappings({
            @Mapping(source = "dni",target = "adviserId"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "clave",target = "password")
    })
    Adviser toAdviser(Asesor asesor);

    @InheritInverseConfiguration
    @Mapping(target = "pedidos",ignore = true)
    Asesor toAsesor(Adviser adviser);

}
