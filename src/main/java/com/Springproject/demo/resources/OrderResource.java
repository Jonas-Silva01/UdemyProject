package com.Springproject.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springproject.demo.entities.Orders;
import com.Springproject.demo.service.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderService service;
	
	@GetMapping 
	public ResponseEntity<List<Orders>> findAll(){
		List<Orders> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Orders> findById(@PathVariable Long id){
		Orders obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
}
