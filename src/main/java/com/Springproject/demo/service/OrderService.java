package com.Springproject.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springproject.demo.entities.Orders;
import com.Springproject.demo.repository.OrderRepository;


@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Orders> findAll(){
		return repository.findAll();
	}
	
	public Orders findById(Long id) {
		Optional<Orders> obj = repository.findById(id);
		return obj.get();
	}
}
