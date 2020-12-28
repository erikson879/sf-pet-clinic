package erod.springframework.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import erod.springframework.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Integer> {
	protected Map<ID,T> map = new HashMap<>();
	
	Set<T> findAll(){
		return new HashSet<>(map.values());
	}
	
	T findById(ID id) {
		return map.get(id);
	}
	
	T save(T object) {
		if(object != null) {
			if( object.getId() == null) {
				object.setId(getNextId());
			}
			map.put((ID)object.getId(), object);
		}else {
			throw new RuntimeException("Object cannot be null");
		}
		return object;
	}
	
	void deleteById (ID id) {
		map.remove(id);
	}
	
	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
	
	private Integer getNextId() {
		try {
			return Collections.max(map.keySet()) + 1;
		} catch (NoSuchElementException e) {
			return 1;
		}
		
	}
}
