package com.medireport.persistence.repository;

import com.medireport.domain.Attention;
import com.medireport.domain.repository.AttentionRepository;
import com.medireport.persistence.crud.AtencionCrudRepository;
import com.medireport.persistence.entity.Atencion;
import com.medireport.persistence.mapper.AttentionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AtencionRepository implements AttentionRepository {

    @Autowired
    private AtencionCrudRepository atencionCrudRepository;

    @Autowired
    private AttentionMapper mapper;


    @Override
    public List<Attention> getAll() {
        return mapper.toAttentions((List<Atencion>) atencionCrudRepository.findAll());
    }

    @Override
    public Optional<Attention> getAttention(int atencionId) {
        return atencionCrudRepository.findById(atencionId).map(
                atencion -> mapper.toAttention(atencion));
    }

    @Override
    public Optional<List<Attention>> getByAdviser(String adviserId) {
        return atencionCrudRepository.findByIdAsesor(adviserId).
                map(atenciones -> mapper.toAttentions(atenciones));
    }

    @Override
    public Attention newAttention(Attention attention) {
        Atencion atencion = mapper.toAtencion(attention);
        atencion.getExamenes().forEach(atencionExamen -> atencionExamen.setAtencion(atencion));
        return mapper.toAttention(atencionCrudRepository.save(atencion));
    }
}
