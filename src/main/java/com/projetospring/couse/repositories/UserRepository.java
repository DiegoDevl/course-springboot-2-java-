package com.projetospring.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.couse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
