package com.Springproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springproject.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
