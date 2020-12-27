package erod.springframework.services;

import erod.springframework.model.Owner;

public interface OwnerService extends CrudService<Owner,Integer>{
	
	Owner findByLastName(String lastName);
}
