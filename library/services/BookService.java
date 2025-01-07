package com.library.services;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.library.dao.BookRepository;
import com.library.dao.GenreRepository;
import com.library.entity.Book;

@Service
public class BookService implements IBookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private GenreRepository genreRepository;
	
	@Override
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book addBook(Book book) {
		
		return bookRepository.save(book);
	}

	public void deleteBook(Integer bookId) {
		bookRepository.deleteById(bookId);
	}



	public Optional<Book> getOneBook(Integer bookId) {
	return bookRepository.findById(bookId);
	}

	public void updateExistingBook(Book existingBook) {
		bookRepository.save(existingBook);
	}

	

	
}
