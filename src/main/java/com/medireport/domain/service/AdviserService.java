package com.medireport.domain.service;

import com.medireport.domain.Adviser;
import com.medireport.domain.Patient;
import com.medireport.domain.repository.AdviserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdviserService {

    private AdviserRepository adviserRepository;

    public List<Adviser> getAll(){
        return adviserRepository.getAll();
    }

    public Optional<Adviser> getAdviser(String adviserId){
        return adviserRepository.getAdviser(adviserId);
    }

    public Adviser save(Adviser adviser){
        return adviserRepository.save(adviser);
    }

    public boolean delete (String adviserId){
        return getAdviser(adviserId).map(adviser -> {
            adviserRepository.delete(adviserId);
            return true;
        }).orElse(false);
    }

}
