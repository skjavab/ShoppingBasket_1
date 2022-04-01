package com.app.services;

import java.util.List;

import com.app.entity.Book;
import com.app.entity.BooksDiscountDetails;

/**
 * interface: BookCartService
 *
 */
public interface BookCartService {


	public List<Book> getAllBooks();

	public List<BooksDiscountDetails> getAllBookDiscountDetails();

	
}
