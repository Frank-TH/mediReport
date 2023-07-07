package com.medireport.persistence.mapper;

import com.medireport.domain.Patient;
import com.medireport.persistence.entity.Paciente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    @Mappings({
            @Mapping(source = "dni",target = "patientId"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "clave",target = "password")
    })
    Patient toPatient(Paciente paciente);

    @InheritInverseConfiguration
    @Mapping(target = "pedidos", ignore = true)
    Paciente toPaciente(Patient patient);
}
