package com.Springproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springproject.demo.entities.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long>{

}
