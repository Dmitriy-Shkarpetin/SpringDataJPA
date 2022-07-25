package com.app.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.springdatajpa.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
