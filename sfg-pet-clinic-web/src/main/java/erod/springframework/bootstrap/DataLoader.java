package erod.springframework.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import erod.springframework.model.Owner;
import erod.springframework.model.Pet;
import erod.springframework.model.PetType;
import erod.springframework.model.Specialty;
import erod.springframework.model.Vet;
import erod.springframework.services.OwnerService;
import erod.springframework.services.PetTypeService;
import erod.springframework.services.SpecialtyService;
import erod.springframework.services.VetService;

/**
 *@author erod 2020-12-27
 */
@Component
public class DataLoader implements CommandLineRunner	{
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialtyService specialtyService;
	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialtyService = specialtyService;

	}

	@Override
	public void run(String... args) throws Exception {
		int count = petTypeService.findAll().size();
		if(count == 0 ) {
			loadData();
		}
	}

	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);

		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);

		Specialty radiology = new Specialty();
		radiology.setDescription("Radiology");
		Specialty savedRadiology = specialtyService.save(radiology);

		Specialty surgery = new Specialty();
		surgery.setDescription("Surgery");
		Specialty savedSurgery = specialtyService.save(surgery);

		Specialty dentistry = new Specialty();
		dentistry.setDescription("Dentistry");
		Specialty savedDentistry = specialtyService.save(dentistry);

		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddres("123 Brickel");
		owner1.setCity("Miami");
		owner1.setTelephone("123123131");

		Pet mikePet = new Pet();
		mikePet.setPetType(savedDogPetType);
		mikePet.setOwner(owner1);
		mikePet.setBirthDate(LocalDate.now());
		mikePet.setName("Rosco");
		owner1.getPets().add(mikePet);
		ownerService.save(owner1);
		Owner owner2 = new Owner();
		owner2.setFirstName("Fabiola");
		owner2.setLastName("Glenanne");
		owner2.setAddres("123 Brickel");
		owner2.setCity("Miami");
		owner2.setTelephone("123123131");

		Pet fabiolaPet = new Pet();
		fabiolaPet.setPetType(savedCatPetType);
		fabiolaPet.setOwner(owner2);
		fabiolaPet.setBirthDate(LocalDate.now());
		fabiolaPet.setName("Just cat");
		owner2.getPets().add(fabiolaPet);
		ownerService.save(owner2);
		System.out.println("Loaded Owners...");
		Vet vet1 = new Vet();
		vet1.setFirstName("San");
		vet1.setLastName("Axe");
		vet1.getSpecialties().add(savedRadiology);
		vetService.save(vet1);
		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vet2.getSpecialties().add(savedSurgery);
		vetService.save(vet2);
		System.out.println("Loaded Vets...");
	}

}
