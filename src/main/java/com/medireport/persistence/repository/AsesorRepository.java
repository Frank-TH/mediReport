package com.medireport.persistence.repository;

import com.medireport.domain.Adviser;
import com.medireport.domain.repository.AdviserRepository;
import com.medireport.persistence.crud.AsesorCrudRepository;
import com.medireport.persistence.entity.Asesor;
import com.medireport.persistence.mapper.AdviserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AsesorRepository implements AdviserRepository {

    @Autowired
    private AsesorCrudRepository asesorCrudRepository;
    @Autowired
    private AdviserMapper mapper;

    @Override
    public List<Adviser> getAll() {
        List<Asesor> asesores = (List<Asesor>) asesorCrudRepository.findAll();
        return mapper.toAdvisers(asesores);
    }

    @Override
    public Optional<Adviser> getAdviser(String adviserId) {
        return asesorCrudRepository.findById(adviserId).map(asesor -> mapper.toAdviser(asesor));
    }


    @Override
    public Adviser newAdviser(Adviser adviser) {
        Asesor asesor = mapper.toAsesor(adviser);
        return mapper.toAdviser(asesorCrudRepository.save(asesor));
    }

    @Override
    public void deleteAdviser(String adviserId) {
        asesorCrudRepository.deleteById(adviserId);
    }
}
