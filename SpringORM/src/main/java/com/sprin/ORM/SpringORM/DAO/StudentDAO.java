package com.sprin.ORM.SpringORM.DAO;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.sprin.ORM.SpringORM.Entities.Student;

import jakarta.transaction.Transactional;

public class StudentDAO {
	

	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
//	save data
	@Transactional
	public int insert(Student student) {
		
	return (int) this.hibernateTemplate.save(student);
		//return i;
	}
	
//	get single data or object 
	
	public void getStudent(int studentID) {
	Student student = hibernateTemplate.get(Student.class, studentID);
	System.out.println("data fetch using get() : " + student);

	}
	
	//get all data
	public void getAllStudent(){
		List<Student> student = hibernateTemplate.loadAll(Student.class);
		for (Student list : student) {
			System.out.println("ID : " + list.getStudentID() + "  Name : " + list.getStudentName() + "  City : " + list.getCity());
			
		}
		
	}
	
	//delete data
	@Transactional
	public void deleteStudent(int studentID) {
		Student student = hibernateTemplate.get(Student.class, studentID);
		this.hibernateTemplate.delete(student);
		System.out.println(student);
	}
	
	//update data
	@Transactional
	public void updateStudent(Student student) {
		
		this.hibernateTemplate.update(student);
		System.out.println(student);
	}
	

}
