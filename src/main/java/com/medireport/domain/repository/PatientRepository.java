package com.medireport.domain.repository;

import com.medireport.domain.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientRepository {

    List<Patient> getAll();
    Optional<Patient> getPatient(String patientId);
    Patient save(Patient patient);
    void delete (String patientId);

}
