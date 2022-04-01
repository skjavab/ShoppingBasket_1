
package com.app.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Book;
import com.app.repository.BookRepository;
import com.app.services.BookCartService;

@Service
public class BookCartServiceImpl implements BookCartService {

	@Autowired
	BookRepository repository;
	
	public List<Book> getAllBooks() {
		final List<Book> books = new ArrayList<>();
		repository.findAll().forEach(book -> books.add(book));
		return books;
	}
}
