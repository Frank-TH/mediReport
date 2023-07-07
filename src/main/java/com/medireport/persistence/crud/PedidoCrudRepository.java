package com.medireport.persistence.crud;

import com.medireport.persistence.entity.Pedido;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PedidoCrudRepository extends CrudRepository<Pedido, Integer> {


    Optional<List<Pedido>> findByIdPaciente(String idPaciente);

    Optional<List<Pedido>> findByIdAsesor(String idAsesor);
}
