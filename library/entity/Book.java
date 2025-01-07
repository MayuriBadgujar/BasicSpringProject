package com.library.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Book {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "book_id")
    private Integer id;

    private String title;

   private String author;

    private Date releaseDate;
    

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "genre_id")  // Foreign key column in Book table
    private Genre genre;

    public Book() {}

    public Book(Integer id, String title, String author, Date releaseDate,Genre genre) {
        super();
        this.id = id;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.genre=genre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", releaseDate=" + releaseDate
				+ ", genre=" + genre + "]";
	}
    
    
   
}






//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//
//@Entity
//public class Book {
//    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="book_id")
//    private int bookId;
//    
//    @Column(name="book_title", length=30)
//    private String title;
//    
//    @Column(name="book_author", length=30)
//    private String author;
//    
//    @Column(name="book_price")
//    private float price;
//
//    // Added Genre field with ManyToOne mapping
//    @ManyToOne
//    @JoinColumn(name = "genre_id")  // Foreign key column in Book table
//    private Genre genre;
//
//    public Book() {
//    }
//
//    public Book(int bookId, String title, String author, float price, Genre genre) {
//        this.bookId = bookId;
//        this.title = title;
//        this.author = author;
//        this.price = price;
//        this.genre = genre;
//    }
//
//    public int getBookId() {
//        return bookId;
//    }
//
//    public void setBookId(int bookId) {
//        this.bookId = bookId;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public float getPrice() {
//        return price;
//    }
//
//    public void setPrice(float price) {
//        this.price = price;
//    }
//
//    public Genre getGenre() {
//        return genre;
//    }
//
//    public void setGenre(Genre genre) {
//        this.genre = genre;
//    }
//
//    @Override
//    public String toString() {
//        return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price + ", genre=" + genre + "]";
//    }
//}
//
