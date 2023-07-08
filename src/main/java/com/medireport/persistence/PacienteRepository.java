package com.medireport.persistence;

import com.medireport.domain.Patient;
import com.medireport.domain.repository.PatientRepository;
import com.medireport.persistence.crud.PacienteCrudRepository;
import com.medireport.persistence.entity.Paciente;
import com.medireport.persistence.mapper.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PacienteRepository implements PatientRepository {

    @Autowired
    private PacienteCrudRepository pacienteCrudRepository;

    @Autowired
    private PatientMapper mapper;


    @Override
    public List<Patient> getAll() {
        List<Paciente> pacientes = (List<Paciente>) pacienteCrudRepository.findAll();
        return mapper.toPatients(pacientes);
    }

    @Override
    public Optional<Patient> getPatient(String patientId) {
        return pacienteCrudRepository.findById(patientId).map(paciente -> mapper.toPatient(paciente));
    }

    @Override
    public Patient save(Patient patient) {
        Paciente paciente = mapper.toPaciente(patient);
        return mapper.toPatient(pacienteCrudRepository.save(paciente));
    }

    @Override
    public void delete(String patientId) {
        pacienteCrudRepository.deleteById(patientId);
    }
}
