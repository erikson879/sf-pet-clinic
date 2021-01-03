package erod.springframework.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import erod.springframework.model.Owner;
import erod.springframework.model.Pet;
import erod.springframework.model.PetType;
import erod.springframework.services.OwnerService;
import erod.springframework.services.PetService;
import erod.springframework.services.PetTypeService;
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Integer> implements OwnerService{

	private final PetTypeService petTypeService;
	private final PetService petService;

	
	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		super();
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Owner save(Owner owner) {
		if(owner != null) {
			owner.getPets().forEach(pet ->{
				if(pet.getPetType() != null) {
					if(pet.getPetType().getId() ==null) {
						pet.setPetType(petTypeService.save(pet.getPetType()));
					}
				}else {
					throw new RuntimeException("Pet type es required.");
				}
				
				if(pet.getId() == null) {
					Pet savedPet = petService.save(pet);
					pet.setId(savedPet.getId());
				}
			});
			return super.save(owner);
		}else {
			return null;
		}
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
