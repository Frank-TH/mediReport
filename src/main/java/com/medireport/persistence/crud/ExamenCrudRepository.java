package com.medireport.persistence.crud;

import com.medireport.persistence.entity.Examen;
import org.springframework.data.repository.CrudRepository;

public interface ExamenCrudRepository extends CrudRepository<Examen, Integer> {

}
