package com.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Book;
import com.app.services.BookCartService;

@RestController
@RequestMapping("/api")
public class BookCartController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	BookCartService service;

	public List<Book> getAllBooks() {
		log.info("Getting book details from the database.");
		return service.getAllBooks();
	}
}
