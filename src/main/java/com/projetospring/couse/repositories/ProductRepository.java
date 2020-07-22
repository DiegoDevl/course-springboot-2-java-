package com.projetospring.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.couse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
