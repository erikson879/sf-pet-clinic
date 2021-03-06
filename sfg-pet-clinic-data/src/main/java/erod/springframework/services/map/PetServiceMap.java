package erod.springframework.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import erod.springframework.model.Pet;
import erod.springframework.services.PetService;
@Service
public class PetServiceMap extends AbstractMapService<Pet, Integer> implements  PetService{

	@Override
	public Pet save(Pet type) {
		return super.save( type);
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Integer id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

}
