package com.ecnu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ecnu.entity.People;
import com.ecnu.repository.PeopleRepository;

public class PeopleService implements UserDetailsService{

	@Autowired
	PeopleRepository peopleRepository;
	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		People people = peopleRepository.findByUsername(arg0);
		
		if(people==null) {
			throw new UsernameNotFoundException("用户名不存在");
		}
		return people;
	}

}
