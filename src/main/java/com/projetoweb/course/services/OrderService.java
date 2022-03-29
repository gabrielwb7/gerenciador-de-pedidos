package com.projetoweb.course.services;

import com.projetoweb.course.entities.Order;
import com.projetoweb.course.entities.User;
import com.projetoweb.course.repositories.OrderRepository;
import com.projetoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> order = repository.findById(id);
        return order.get();
    }





















}
