package com.hasan.library.author;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.hasan.library.book.Book;

@Entity
public class Author {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String dob;
	
	@ManyToMany(mappedBy = "authors")
	private List<Book> books;
	
	public Author() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	

}
