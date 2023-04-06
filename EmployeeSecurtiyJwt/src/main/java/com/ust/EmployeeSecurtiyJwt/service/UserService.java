package com.ust.EmployeeSecurtiyJwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ust.EmployeeSecurtiyJwt.entity.User;
import com.ust.EmployeeSecurtiyJwt.repo.Userrepository;


@Service
public class UserService implements UserDetailsService {
	@Autowired
	private Userrepository repo;

	@Override
	public UserDetails loadUserByUsername(String username)throws UsernameNotFoundException{
		User user=repo.findByUsername(username);
		
		return new org.springframework.security.core.userdetails.User(user.getusername(),user.getPassword(),new ArrayList<>());
		
	}
}
