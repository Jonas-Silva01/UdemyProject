package com.Springproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springproject.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
