package com.kgisl.demo.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.demo.entity.Person;

@Repository
public interface PersonRepository extends ListCrudRepository<Person, Integer> {

}
