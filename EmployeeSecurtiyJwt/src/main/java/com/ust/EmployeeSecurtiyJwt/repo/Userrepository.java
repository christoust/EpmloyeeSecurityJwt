package com.ust.EmployeeSecurtiyJwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.EmployeeSecurtiyJwt.entity.User;

public interface Userrepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);

}
