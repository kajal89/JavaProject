package com.Hibernate.Hibernate_maven;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Embadable_Ex")
public class Employee {
	
	@Id
	private int EmpId;
	private String name;
	private int salary;
	 private Certifications certificate;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name, int salary, Certifications certificate) {
		super();
		EmpId = empId;
		this.name = name;
		this.salary = salary;
		this.certificate = certificate;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Certifications getCertificate() {
		return certificate;
	}
	public void setCertificate(Certifications certificate) {
		this.certificate = certificate;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", name=" + name + ", salary=" + salary + ", certificate=" + certificate
				+ "]";
	}
	
	

}
