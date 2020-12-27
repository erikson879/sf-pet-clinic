package erod.springframework.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import erod.springframework.model.Owner;
import erod.springframework.model.Vet;
import erod.springframework.services.OwnerService;
import erod.springframework.services.VetService;
import erod.springframework.services.map.OwnerServiceMap;
import erod.springframework.services.map.VetServiceMap;

/**
*@author erod 2020-12-27
*/
@Component
public class DataLoader implements CommandLineRunner	{

	private final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader() {
		ownerService = new OwnerServiceMap();
		vetService = new VetServiceMap();
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setId(1);
		owner1.setFirtsName("Michael");
		owner1.setLastName("Weston");
		ownerService.save(owner1);
		Owner owner2 = new Owner();
		owner2.setId(2);
		owner2.setFirtsName("Fabiola");
		owner2.setLastName("Glenanne");
		ownerService.save(owner2);
		System.out.println("Loaded Owners...");
		Vet vet1 = new Vet();
		vet1.setId(1);
		vet1.setFirtsName("San");
		vet1.setLastName("Axe");
		vetService.save(vet1);
		Vet vet2 = new Vet();
		vet2.setId(2);
		vet2.setFirtsName("Jessie");
		vet2.setLastName("Porter");
		vetService.save(vet1);
		System.out.println("Loaded Vets...");
	}

}
