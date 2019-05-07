package com.hasan.library.user;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.hasan.library.book.Book;

@Entity
public class User {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="first_name")
	private String fName;
	
	@Column(name="last_name") // only if you want to give a different table name
	private String lName;
	private String email;
	private Integer uType;
	
	@OneToMany(mappedBy="user")
	private List<Book> books;
	
	public User() {
		
	}
		
	public long getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getuType() {
		return uType;
	}
	public void setuType(Integer uType) {
		this.uType = uType;
	}
	
	
}
