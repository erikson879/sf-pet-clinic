package erod.springframework.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import erod.springframework.model.PetType;
import erod.springframework.services.PetTypeService;

/**
*@author erod 2021-01-02
*/
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Integer> implements PetTypeService{

	@Override
	public Set<PetType> findAll() {
		return super.findAll();
	}

	@Override
	public PetType findById(Integer id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public PetType save(PetType object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(PetType object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
	
}
