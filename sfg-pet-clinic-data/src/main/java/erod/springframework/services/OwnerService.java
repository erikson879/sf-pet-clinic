package erod.springframework.services;

import java.util.Set;

import erod.springframework.model.Owner;

public interface OwnerService {
	Owner findbyId(Integer id);
	Owner save(Owner owner);
	Set<Owner> findAll();
}
