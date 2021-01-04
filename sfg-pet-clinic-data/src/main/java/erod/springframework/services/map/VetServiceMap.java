package erod.springframework.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import erod.springframework.model.Specialty;
import erod.springframework.model.Vet;
import erod.springframework.services.SpecialtyService;
import erod.springframework.services.VetService;
@Service
public class VetServiceMap extends AbstractMapService<Vet, Integer> implements VetService{

	private final SpecialtyService specialtyService; 
	public VetServiceMap(SpecialtyService specialtyService) {
		super();
		this.specialtyService = specialtyService;
	}

	@Override
	public Vet save(Vet type) {
		if(type.getSpecialties().size() > 0 ) {
			type.getSpecialties().forEach(specialty -> {
				if(specialty.getId() == null) {
					Specialty savedSpecialty = specialtyService.save(specialty);
					specialty.setId(savedSpecialty.getId() );
				}
			});
		}
		return super.save( type);
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
