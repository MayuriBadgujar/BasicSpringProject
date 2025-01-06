package book_library.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import book_library.entity.Book;
import book_library.exceptions.BookNotFoundException;
import book_library.service.BookService;

@RestController
public class BookRestController {
	@Autowired
private BookService bookServiceReferenece;
@GetMapping("/books-api")
public Collection<Book> getAllBooks(){
	Collection<Book> allAvailableBooks=bookServiceReferenece.getAllBooks();
	return allAvailableBooks;
	
}
@GetMapping("/books-api/{bookId}")
public  Book getOneBook(@PathVariable("bookId") int bookId) {
	Book foundBook=bookServiceReferenece.getOneBook(bookId);
	//if book not found,raise the BookNotFoundexception
	if(foundBook==null)
		throw new BookNotFoundException("Book with given ID not",bookId);
	return foundBook;
}
@PostMapping("/books-api")
public  void createNewBook(@RequestBody Book newBook) {
	System.out.println("Book Added Successfully!!");
	bookServiceReferenece.createNewBook(newBook);
}

@PutMapping("/books-api")

public void updateExistingBook(@RequestBody Book existingBook) {

	bookServiceReferenece.updateExistingBook(existingBook);

}
@DeleteMapping("books-api/{bookId}")
	public void deleteOneBook(@PathVariable int bookId) {
	bookServiceReferenece.deleteOneBook(bookId);
}

}
