package com.RestAPI.Book.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.RestAPI.Book.DAO.BookDAO;
import com.RestAPI.Book.Entities.Book;

@Service
public class BookService {
	
	@Autowired
	private BookDAO bookDAO;
	
	
	public List<Book> getAllBooks() {
	List<Book> all = (List<Book>)this.bookDAO.findAll();
		return all;
		
	}
	public Book addBook(Book book) {
		
		Book save = this.bookDAO.save(book);
		return save;
	
	}
	
	//delete data
	public void deleteBook(int bid) {
//		list = list.stream().filter(book->book.getId()!=bid).collect(Collectors.toList());
		this.bookDAO.deleteById(bid);
		System.out.println("data is deleted!!!");
		
	}
	
	//update data 
	
	public void updateData(Book book, int id) {
		/*
		 * list = list.stream().map(e->{ if(e.getId()==id) {
		 * e.setTitle(book.getTitle()); e.setAuthor(book.getAuthor()); } return book;
		 * }).collect(Collectors.toList());
		 */	
		
		Book update = bookDAO.save(book);
		System.out.println(update);
	}

}
