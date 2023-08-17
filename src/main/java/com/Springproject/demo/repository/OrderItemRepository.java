package com.Springproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springproject.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
