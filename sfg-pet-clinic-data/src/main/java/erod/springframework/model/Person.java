package erod.springframework.model;

public class Person extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firtsName;
	private String lastName;
	public String getFirtsName() {
		return firtsName;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
