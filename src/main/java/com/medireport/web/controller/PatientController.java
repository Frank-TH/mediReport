package com.medireport.web.controller;


import com.medireport.domain.Patient;
import com.medireport.domain.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {


    @Autowired
    private PatientService patientService;

    @GetMapping("/all")
    public ResponseEntity<List<Patient>> getAll() {
        return new ResponseEntity<>(patientService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatient(@PathVariable("id") String patientId) {
        return patientService.getPatient(patientId)
                .map(patient -> new ResponseEntity<>(patient, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Patient> save(@RequestBody Patient patient) {
        return new ResponseEntity<>(patientService.save(patient), HttpStatus.CREATED);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") String patientId) {
        if (patientService.delete(patientId)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }


}
