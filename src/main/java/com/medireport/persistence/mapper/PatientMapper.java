package com.medireport.persistence.mapper;

import com.medireport.domain.Patient;
import com.medireport.persistence.entity.Paciente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    @Mappings({
            @Mapping(source = "dni", target = "patientId"),
            @Mapping(source = "nombre", target = "name")
    })
    Patient toPatient(Paciente paciente);

    List<Patient> toPatients(List<Paciente> pacientes);

    @InheritInverseConfiguration
    @Mapping(target = "pedidos", ignore = true)
    Paciente toPaciente(Patient patient);
}
