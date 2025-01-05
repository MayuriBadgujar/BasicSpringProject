package book_library.store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import book_library.entity.Book;

public class BookStore {
	private static Map<Integer, Book> allBooks;
	static {
		allBooks = new HashMap<>();
		Book b1 = new Book(101, "ShreemadDasbodh", "Ramdas Swami", 500.50f);
		Book b2 = new Book(102, "ShreeSadguruCharitra", "Ramdas Swami", 400.50f);
		Book b3 = new Book(103, "Shree", "Ramdas Swami", 700.50f);
		allBooks.put(b1.getBookId(), b1);
		allBooks.put(b2.getBookId(), b2);
		allBooks.put(b3.getBookId(), b3);
	}

//a method to return the all books
	public static Collection<Book> getAllBooks() {
		Collection<Book> allAvailableBooks = allBooks.values();
		return allAvailableBooks;
	}

	// a method to return against its id
	public static Book getOneBook(int bookId) {
		Book foundBook = allBooks.get(bookId);
		return foundBook;
	}
	
	
	//A METHOD TO ADD A NEW BOOK
	public static void createNewBook(Book newBook) {
		allBooks.put(newBook.getBookId(), newBook);
	}
}
