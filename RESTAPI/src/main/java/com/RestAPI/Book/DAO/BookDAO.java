package com.RestAPI.Book.DAO;

import org.springframework.data.repository.CrudRepository;

import com.RestAPI.Book.Entities.Book;

public interface BookDAO extends CrudRepository<Book, Integer> {
	
	public Book findById(int id);
	

}
