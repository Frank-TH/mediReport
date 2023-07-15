package com.medireport.domain.repository;

import com.medireport.domain.Adviser;
import com.medireport.domain.Patient;

import java.util.List;
import java.util.Optional;

public interface AdviserRepository {

    List<Adviser> getAll();
    Optional<Adviser> getAdviser(String adviserId);
    Adviser save(Adviser adviser);
    void delete (String adviserId);
}
