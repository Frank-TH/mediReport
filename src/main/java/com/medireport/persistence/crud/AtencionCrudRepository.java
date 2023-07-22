package com.medireport.persistence.crud;

import com.medireport.persistence.entity.Atencion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AtencionCrudRepository extends CrudRepository<Atencion, Integer> {

    Optional<List<Atencion>> findByIdAsesor(String idAsesor);
}
