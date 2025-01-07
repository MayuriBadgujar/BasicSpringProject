package com.library.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.entity.Book;
import com.library.services.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;
	
	
	@PostMapping("/add")
	public  void addBook(@RequestBody Book newBook){
		System.out.println("Book Added Successfully!!");
	  bookService.addBook(newBook);
	
	}
	
	
	@GetMapping("/getAllBooks")
	public List<Book> allBooks() {
		List<Book> allBooksList=bookService.allBooks();
		return allBooksList ;
	}
	
	
	@GetMapping("/getOneBook/{bookId}")
	public Optional<Book> getOneBooks(@PathVariable("bookId") Integer bookId) {
	return 	bookService.getOneBook(bookId);
		
	}

	 @DeleteMapping("/delete/{bookId}")
		public void deleteBook(@PathVariable("bookId") Integer bookId) {
			bookService.deleteBook(bookId);
		}
	 
	 @PutMapping("/update")

	 public void updateExistingBook(@RequestBody Book existingBook) {

	 	bookService.updateExistingBook(existingBook);

	 }
}
