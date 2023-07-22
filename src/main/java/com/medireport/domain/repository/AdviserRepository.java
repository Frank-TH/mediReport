package com.medireport.domain.repository;

import com.medireport.domain.Adviser;

import java.util.List;
import java.util.Optional;

public interface AdviserRepository {

    List<Adviser> getAll();
    Optional<Adviser> getAdviser(String adviserId);
    Adviser newAdviser(Adviser adviser);
    void deleteAdviser (String adviserId);
}
