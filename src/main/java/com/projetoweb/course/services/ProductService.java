package com.projetoweb.course.services;

import com.projetoweb.course.entities.Category;
import com.projetoweb.course.entities.Product;
import com.projetoweb.course.repositories.CategoryRepository;
import com.projetoweb.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> product = repository.findById(id);
        return product.get();
    }





















}
