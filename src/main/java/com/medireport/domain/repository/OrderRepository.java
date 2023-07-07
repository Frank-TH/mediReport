package com.medireport.domain.repository;

import com.medireport.domain.Exam;
import com.medireport.domain.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {

    List<Order> getAll();

    Optional<Order> getOrder(int orderId);

    Optional<List<Order>> getByPatient(String patientId);

    Optional<List<Order>> getByAdviser(String adviserId);

    Order save(Order order);
}
