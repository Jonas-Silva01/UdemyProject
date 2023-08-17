package com.Springproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springproject.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
