package com.hasan.library.author;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AuthorService {
	
	@Autowired
	AuthorRepository authorRepository;
	
	
	public List<Author> getAuthors() {
		return authorRepository.findAll();
	}
	
	public Author addAuthor(Author author) {
		return authorRepository.save(author);
	}
	
	
	public Author getAuthor(long id) {
		return authorRepository.findById(id).get();
	}

	
	public Author updateAuthor(Author author) {
		return authorRepository.save(author);
	}
	
	
	public void deleteAuthor(Author id) {
		authorRepository.delete(id);
	}
	

}
