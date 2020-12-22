package erod.springframework.services;

import java.util.Set;

import erod.springframework.model.Vet;

public interface VetService {
	Vet findbyId(Integer id);
	Vet save(Vet vet);
	Set<Vet> findAll();

}
