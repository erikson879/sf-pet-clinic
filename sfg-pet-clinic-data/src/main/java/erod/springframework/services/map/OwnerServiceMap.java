package erod.springframework.services.map;

import java.util.Set;

import erod.springframework.model.Owner;
import erod.springframework.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Integer> implements OwnerService{

	@Override
	public Owner save(Owner type) {
		return super.save(type.getId(), type);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Integer id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}
	
	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}
}
