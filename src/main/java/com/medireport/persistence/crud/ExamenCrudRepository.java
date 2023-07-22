package com.medireport.persistence.crud;

import com.medireport.persistence.entity.Examen;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ExamenCrudRepository extends CrudRepository<Examen, Integer> {

    Optional<List<Examen>> findByStockLessThan(int stock);
}
