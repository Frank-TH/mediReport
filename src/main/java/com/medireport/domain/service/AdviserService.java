package com.medireport.domain.service;

import com.medireport.domain.Adviser;
import com.medireport.domain.repository.AdviserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdviserService {

    @Autowired
    private AdviserRepository adviserRepository;

    public List<Adviser> getAll() {
        return adviserRepository.getAll();
    }

    public Optional<Adviser> getAdviser(String adviserId) {
        return adviserRepository.getAdviser(adviserId);
    }

    public Adviser save(Adviser adviser) {
        return adviserRepository.newAdviser(adviser);
    }

    public boolean delete(String adviserId) {
        return getAdviser(adviserId).map(adviser -> {
            adviserRepository.deleteAdviser(adviserId);
            return true;
        }).orElse(false);
    }

}
