package one.to.many;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Laptop {
	
	@Id
	@Column(name="Laptop_Id")
	private int laptopId;
	private String brand;
	
	@ManyToOne
	private Person person;
	
	

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Laptop(int laptopId, String brand, Person person) {
		super();
		this.laptopId = laptopId;
		this.brand = brand;
		this.person = person;
	}



	public int getLaptopId() {
		return laptopId;
	}



	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public Person getPerson() {
		return person;
	}



	public void setPerson(Person person) {
		this.person = person;
	}



	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", brand=" + brand + ", person=" + person + "]";
	}
	
	

}
