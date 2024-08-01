package one.to.many;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Person {
	
	@Id
	@Column(name="Person_Id")
	private int personId;
	private String personName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
	private List<Laptop> laptops;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int personId, String personName, List<Laptop> laptops) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.laptops = laptops;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", laptops=" + laptops + "]";
	}
	
	

	
}
