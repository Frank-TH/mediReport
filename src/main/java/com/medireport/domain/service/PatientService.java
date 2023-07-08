package com.medireport.domain.service;

import com.medireport.domain.Patient;
import com.medireport.domain.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAll() {
        return patientRepository.getAll();
    }

    public Optional<Patient> getPatient(String patientId) {
        return patientRepository.getPatient(patientId);
    }

    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    public boolean delete(String patientId) {
        return getPatient(patientId).map(patient -> {
            patientRepository.delete(patientId);
            return true;
        }).orElse(false);
    }

}
