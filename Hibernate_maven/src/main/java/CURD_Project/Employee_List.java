package CURD_Project;

//import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
public class Employee_List {
	
	@Id
	@Column(name="Employee_ID")
	private int employeeId;
	
	@Column(name="Employee_Name")
	private String employeeName;
	
	@Column(name="Salary")
	private long salary;

	public Employee_List() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee_List(int employeeId, String employeeName, long salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee_List [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ "]";
	}
	

}
