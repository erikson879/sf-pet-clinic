package erod.springframework.model;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Set<Pet> pets = new HashSet<Pet>();
	private String addres;
	private String city;
	private String telephone;
	
	public Set<Pet> getPets() {
		return pets;
	}
	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
