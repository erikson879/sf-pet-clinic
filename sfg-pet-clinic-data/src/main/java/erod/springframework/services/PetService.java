package erod.springframework.services;

import java.util.Set;

import erod.springframework.model.Pet;

public interface PetService {
	Pet findbyId(Integer id);
	Pet save(Pet pet);
	Set<Pet> findAll();
}
