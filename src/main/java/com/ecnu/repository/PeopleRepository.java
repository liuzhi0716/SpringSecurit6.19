package com.ecnu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecnu.entity.People;

public interface PeopleRepository extends JpaRepository<People, Integer>{

	People findByUsername(String username);
}
