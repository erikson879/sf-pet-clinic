package erod.springframework.services;

import java.util.Set;

import erod.springframework.model.Person;

public interface PersonServices {
	Person findbyId(Integer id);
	Person save(Person person);
	Set<Person> findAll();

}
