package com.sherin.swagger.SwaggerDemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sherin.swagger.SwaggerDemo.model.Book;
import com.sherin.swagger.SwaggerDemo.service.BookService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService service;

	@PostMapping("/save")
	@ApiOperation("Store book API")
	public String saveBook(@RequestBody Book book) {
		return service.saveBook(book);
	}

	@GetMapping("/searchBook/{bookId}")
	@ApiOperation("Search book API")
	public Optional<Book> getBook(@PathVariable int bookId) {
		return service.getBook(bookId);
	}

	@DeleteMapping("/deleteBook/{bookId}")
	@ApiOperation("Delete book API")
	public List<Book> deleteBook(int bookId) {
		return service.removeBook(bookId);
	}
}
