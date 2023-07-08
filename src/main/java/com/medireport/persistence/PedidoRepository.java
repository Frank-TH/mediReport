package com.medireport.persistence;

import com.medireport.domain.Order;
import com.medireport.domain.repository.OrderRepository;
import com.medireport.persistence.crud.PedidoCrudRepository;
import com.medireport.persistence.entity.Pedido;
import com.medireport.persistence.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class PedidoRepository implements OrderRepository {

    @Autowired
    private PedidoCrudRepository pedidoCrudRepository;

    @Autowired
    private OrderMapper mapper;

    @Override
    public List<Order> getAll() {
        return mapper.toOrder((List<Pedido>) pedidoCrudRepository.findAll());
    }

    @Override
    public Optional<Order> getOrder(int orderId) {
        return pedidoCrudRepository.findById(orderId).map(pedido -> mapper.toOrder(pedido));
    }

    @Override
    public Optional<List<Order>> getByPatient(String patientId) {
        List<Pedido> pedidos = pedidoCrudRepository.findByIdPaciente(patientId);
        return Optional.of(mapper.toOrder(pedidos));
    }

    @Override
    public Optional<List<Order>> getByAdviser(String adviserId) {
        List<Pedido> pedidos = pedidoCrudRepository.findByIdAsesor(adviserId);
        return Optional.of(mapper.toOrder(pedidos));
    }

    @Override
    public Order save(Order order) {
        Pedido pedido = mapper.toPedido(order);
        pedido.getExamenes().forEach(examen -> examen.setPedido(pedido));
        return mapper.toOrder(pedidoCrudRepository.save(pedido));
    }

}
