
package com.app.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Book;
import com.app.entity.BooksDiscountDetails;
import com.app.repository.BookRepository;
import com.app.repository.BooksDiscountRepository;
import com.app.services.BookCartService;

@Service
public class BookCartServiceImpl implements BookCartService {

	@Autowired
	BookRepository repository;
	
	@Autowired
	BooksDiscountRepository booksDiscountRepository;
	
	public List<Book> getAllBooks() {
		 List<Book> books = new ArrayList<>();
		repository.findAll().forEach(book -> books.add(book));
		return books;
	}

	@Override
	public List<BooksDiscountDetails> getAllBookDiscountDetails() {
		ArrayList<BooksDiscountDetails> booksDiscountDetails = new ArrayList<BooksDiscountDetails>();
		booksDiscountRepository.findAll().forEach(discountItemInfo -> booksDiscountDetails.add(discountItemInfo));
		return booksDiscountDetails;
	}
}
