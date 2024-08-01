package many.to.many.relationship;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Projects {
	
	@Id
	@Column(name="Project_Id")
	private int pId;
	
	@Column(name="Project_Name")
	private String ProjectName;
	
	@ManyToMany(mappedBy = "projects")
	private List<Employee_ex> employee;

	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Projects(int pId, String projectName, List<Employee_ex> employee) {
		super();
		this.pId = pId;
		ProjectName = projectName;
		this.employee = employee;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

	public List<Employee_ex> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee_ex> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Projects [pId=" + pId + ", ProjectName=" + ProjectName + ", employee=" + employee + "]";
	}
	
	
	

}
