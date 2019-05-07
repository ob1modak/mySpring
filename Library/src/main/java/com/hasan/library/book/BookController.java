package com.hasan.library.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/book")
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	
	@RequestMapping(method = RequestMethod.GET, value="/all")
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/add")
	public Book addBook(@RequestBody Book book) {
		return bookRepository.save(book);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
	public Book addBook(@PathVariable  long id) {
		return bookRepository.findById(id).get();
	}

	@RequestMapping(method = RequestMethod.PUT, value="/update")
	public Book updateBook(@RequestBody Book book) {
		return bookRepository.save(book);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/{id}")
	public void deleteBook(@PathVariable Book id) {
		bookRepository.delete(id);
	}

}
