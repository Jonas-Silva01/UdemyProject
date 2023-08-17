package com.Springproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springproject.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
