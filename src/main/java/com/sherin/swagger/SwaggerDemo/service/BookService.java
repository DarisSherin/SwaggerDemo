package com.sherin.swagger.SwaggerDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sherin.swagger.SwaggerDemo.model.Book;
import com.sherin.swagger.SwaggerDemo.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;

	public String saveBook(Book book) {
		bookRepo.save(book);
		return "book saved with id ; " + book.getBookId();

	}

	public Optional<Book> getBook(int bookId) {
		return bookRepo.findById(bookId);
	}

	public List<Book> removeBook(int bookId) {
		bookRepo.deleteById(bookId);
		return bookRepo.findAll();
	}
}
