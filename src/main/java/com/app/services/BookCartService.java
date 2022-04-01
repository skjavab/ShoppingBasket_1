package com.app.services;

import java.util.List;

import com.app.entity.Book;
import com.app.entity.BooksDiscountDetails;
import com.app.model.ShoppingCartItem;

/**
 * interface: BookCartService
 *
 */
public interface BookCartService {


	public List<Book> getAllBooks();

	public List<BooksDiscountDetails> getAllBookDiscountDetails();

	public double calculatePrice(List<ShoppingCartItem> shoppingCartItem);

	
}
