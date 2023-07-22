package com.medireport.persistence.mapper;

import com.medireport.domain.Adviser;
import com.medireport.persistence.entity.Asesor;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdviserMapper {
    @Mappings({
            @Mapping(source = "dni",target = "idAdviser"),
            @Mapping(source = "nombres",target = "names"),
            @Mapping(source = "apellidos",target = "lastname"),
            @Mapping(source = "telefono",target = "phone"),
            @Mapping(source = "correo",target = "email"),
            @Mapping(source = "fechaNacimiento",target = "birthdate")
    })
    Adviser toAdviser (Asesor asesor);

    List<Adviser> toAdvisers(List<Asesor> asesores);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "clave",ignore = true),
            @Mapping(target = "estado",ignore = true),
            @Mapping(target = "atenciones",ignore = true),
    })
    Asesor toAsesor(Adviser adviser);

}
