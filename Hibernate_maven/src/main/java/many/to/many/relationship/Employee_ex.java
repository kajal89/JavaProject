package many.to.many.relationship;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee_ex {

	@Id
	@Column(name="Emp_Id")
	private int eId;
	
	@Column(name="Emp_Name")
	private String name;
	
	@ManyToMany
	//give name to create new table after performing query and chnage column name
	@JoinTable(name="Many_To_Many_Table")	
	private List<Projects> projects;

	public Employee_ex() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee_ex(int eId, String name, List<Projects> projects) {
		super();
		this.eId = eId;
		this.name = name;
		this.projects = projects;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee_ex [eId=" + eId + ", name=" + name + ", projects=" + projects + "]";
	}
	
	
	
}
