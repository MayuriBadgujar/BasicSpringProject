package com.library.services;

import java.util.List;

import com.library.entity.Book;

public interface IBookService {

	//Add Books
	Book addBook (Book book);
	
	//Show Books
	List<Book> allBooks();
}
