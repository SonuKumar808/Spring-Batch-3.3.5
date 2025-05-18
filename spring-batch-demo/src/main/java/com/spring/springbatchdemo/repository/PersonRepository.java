package com.spring.springbatchdemo.repository;

import com.spring.springbatchdemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
