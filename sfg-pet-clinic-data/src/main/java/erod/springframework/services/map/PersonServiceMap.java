package erod.springframework.services.map;

import java.util.Set;

import erod.springframework.model.Person;
import erod.springframework.services.CrudService;

public class PersonServiceMap extends AbstractMapService<Person, Integer> implements  CrudService<Person, Integer>{

	@Override
	public Person save(Person type) {
		return super.save(type.getId(), type);
	}

	@Override
	public Set<Person> findAll() {
		return super.findAll();
	}

	@Override
	public Person findById(Integer id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Person object) {
		super.delete(object);
	}

	
}
