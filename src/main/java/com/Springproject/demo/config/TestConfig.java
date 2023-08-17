package com.Springproject.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Springproject.demo.entities.Orders;
import com.Springproject.demo.entities.User;
import com.Springproject.demo.entities.enm.OrderStatus;
import com.Springproject.demo.repository.OrderRepository;
import com.Springproject.demo.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		Orders o1 = new Orders(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1); 
		Orders o2 = new Orders(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2); 
		Orders o3 = new Orders(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT,u1); 

		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}

	
}
