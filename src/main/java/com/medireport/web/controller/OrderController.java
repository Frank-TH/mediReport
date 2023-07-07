package com.medireport.web.controller;


import com.medireport.domain.Order;
import com.medireport.domain.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public ResponseEntity<List<Order>> getAll() {
        return new ResponseEntity<>(orderService.getAll(), HttpStatus.OK);

    }

    @GetMapping("/id")
    public ResponseEntity<Order> getOrder(@PathVariable("id") int orderId) {
        return orderService.getOrder(orderId)
                .map(order -> new ResponseEntity<>(order, HttpStatus.OK)).orElse(
                        new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/patient/{idPantient}")
    public ResponseEntity<List<Order>> getByPatient(@PathVariable("idPantient") String patientId) {
        return orderService.getByPatient(patientId)
                .map(orders -> new ResponseEntity<>(orders, HttpStatus.OK)).
                orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/adviser/{idAdviser}")
    public ResponseEntity<List<Order>> getByAdviser(@PathVariable("idAdviser") String adviderId) {
        return orderService.getByAdviser(adviderId)
                .map(orders -> new ResponseEntity<>(orders, HttpStatus.OK)).
                orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Order> save(@RequestBody Order order) {
        return new ResponseEntity<>(orderService.save(order), HttpStatus.CREATED);
    }


}
