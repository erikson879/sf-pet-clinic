package erod.springframework.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import erod.springframework.model.Vet;
import erod.springframework.services.VetService;
@Service
public class VetServiceMap extends AbstractMapService<Vet, Integer> implements VetService{

	@Override
	public Vet save(Vet type) {
		return super.save(type.getId(), type);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Integer id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

	
}
