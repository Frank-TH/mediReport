package com.medireport.persistence.crud;

import com.medireport.persistence.entity.Examen;
import com.medireport.persistence.entity.Paciente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PacienteCrudRepository extends CrudRepository<Paciente, String> {
}
