package com.medireport.domain.service;

import com.medireport.domain.Order;
import com.medireport.domain.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAll() {
        return orderRepository.getAll();
    }

    public Optional<Order> getOrder(int orderId) {
        return orderRepository.getOrder(orderId);
    }

    public Optional<List<Order>> getByPatient(String patientId) {
        return orderRepository.getByPatient(patientId);
    }

    public Optional<List<Order>> getByAdviser(String adviserId) {
        return orderRepository.getByAdviser(adviserId);
    }

    public Order save(Order order) {
        return orderRepository.save(order);
    }

}
