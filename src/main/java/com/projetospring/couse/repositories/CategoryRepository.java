package com.projetospring.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.couse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
