package book_library.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book_library.entity.Book;
import book_library.repository.BookRepository;

@Service // marks this class as a service and it is managing by spring
public class BookService {
	@Autowired
	private BookRepository bookRepositoryReference;

	public Collection<Book> getAllBooks() {

		Collection<Book> allBooks = bookRepositoryReference.findAll();
		return allBooks;
	}

	public Book getOneBook(int bookId) {
		Book foundBook = null;
		Optional<Book> opt = bookRepositoryReference.findById(bookId);
		if (opt.isPresent()) // if found
			foundBook = opt.get(); // get the book
		return foundBook;

	}

	public void createNewBook(Book newBook) {
		bookRepositoryReference.save(newBook);
	}
	
	public void updateExistingBook(Book existingBook) {
		bookRepositoryReference.save(existingBook);
	}
	
	public void deleteOneBook(int bookId) {
		bookRepositoryReference.deleteById(bookId);
	}
}
