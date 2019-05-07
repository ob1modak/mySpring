package com.hasan.library.author;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/author")
public class AuthorController {
	
	@Autowired
	AuthorService authorService;
	
	@RequestMapping(method = RequestMethod.GET, value="/all")
	public List<Author> getAuthors() {
		return authorService.getAuthors();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/add")
	public Author addAuthor(@RequestBody Author author) {
		return authorService.addAuthor(author);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
	public Author getAuthor(@PathVariable  long id) {
		return authorService.getAuthor(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value="/update")
	public Author updateAuthor(@RequestBody Author author) {
		return authorService.updateAuthor(author);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/{id}")
	public void deleteAuthor(@PathVariable Author id) {
		authorService.deleteAuthor(id);
	}

}
