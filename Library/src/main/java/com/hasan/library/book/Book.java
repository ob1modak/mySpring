package com.hasan.library.book;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.hasan.library.author.Author;
import com.hasan.library.user.User;

@Entity
public class Book {
	
	@Id
	@GeneratedValue
	private long id;
	private String title;
	private String author;
	private String isbn;
	private String pDate;
	
	@ManyToMany
	private List<Author> authors;
	
	@ManyToOne
	private User user;
	
	
	
	
	public Book() {
		
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getpDate() {
		return pDate;
	}
	public void setpDate(String pDate) {
		this.pDate = pDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	

}
