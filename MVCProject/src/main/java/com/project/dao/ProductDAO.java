package com.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.project.model.Product;

import jakarta.transaction.Transactional;

@Component
public class ProductDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//Insert or add data
	@Transactional
	public void createProduct(Product product) {
		System.out.println("Data Inserted !!!!");
		this.hibernateTemplate.saveOrUpdate(product);
		
	}
	
	//Retrive data
	public List<Product> getProducts(){
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	
	//delete product
	@Transactional
	public void deleteProduct(int id) {
		Product product = this.hibernateTemplate.load(Product.class,id);
		this.hibernateTemplate.delete(product);
		
	}

	public Product getProduct(int pid) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Product.class,pid);
		
	}

}
