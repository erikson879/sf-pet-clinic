package erod.springframework.services;

import java.util.Set;

public interface CrudService<T,Id> {
	Set<T> findAll();
	T findById(Id id);
	T save(T type);
	void delete(T type);
	void deleteById(Id id);
}
