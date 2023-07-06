package com.medireport.persistence.crud;

import com.medireport.persistence.entity.Examen;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExamenCrudRepository extends org.springframework.data.repository.CrudRepository<Examen, Integer> {

    //@Query(value = "SELECT nombre FROM examenes WHERE id = ?",nativeQuery = true)
    //Buscar Examen
    //Examen findById(int id);

}
