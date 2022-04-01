package com.app.util;

import java.util.ArrayList;
import java.util.List;

import com.app.entity.Book;
import com.app.entity.BooksDiscountDetails;
import com.app.model.ShoppingCartItem;

public class BookCartTestUtil {

	public static ArrayList<Book> getBooks() {
		ArrayList<Book> listBooks = new ArrayList<Book>();
		Integer price = 50;
		Integer bookList[] = { 1, 2, 3, 4, 5 };
		String title[] = { "Clean Code", "Clean Coder", "Clean Architecture", "Test Driven Development by Example",
				"Working effectively with Legacy Code" };

		String author[] = { "Robert Martin", "Robert Martin", "Robert Martin", "Kent Beck", "Michael C. Feathers" };
		int year[] = { 2008, 2011, 2017, 2003, 2004 };
		for (int i = 0; i < bookList.length; i++) {
			Book book = new Book();
			book.setId(bookList[i]);
			book.setTitle(title[i]);
			book.setAuthor(author[i]);
			book.setYear(year[i]);
			book.setPrice(price);
			listBooks.add(book);
		}
		return listBooks;
	}

	public static List<BooksDiscountDetails> getBooksDiscountDetails() {
		int differentCopies[] = { 2, 3, 4, 5 };
		int discountList[] = { 5, 10, 20, 25 };
		List<BooksDiscountDetails> byDifferentCopiesDiscountList = new ArrayList<>();
		BooksDiscountDetails booksDiscountDetails = null;
		for (int i = 0; i < discountList.length; i++) {
			booksDiscountDetails = new BooksDiscountDetails();
			booksDiscountDetails.setId(i + 1);
			booksDiscountDetails.setDifferentCopies(differentCopies[i]);
			booksDiscountDetails.setDiscount(discountList[i]);
			byDifferentCopiesDiscountList.add(booksDiscountDetails);

		}
		return byDifferentCopiesDiscountList;
	}
	
	public static List<ShoppingCartItem> bookCart() {
		List<ShoppingCartItem> shoppingCartItemList = new ArrayList<ShoppingCartItem>();
		ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
		shoppingCartItem.setBookName("Clean Code");
		shoppingCartItem.setQuantity(1);
		shoppingCartItemList.add(shoppingCartItem);
		return shoppingCartItemList;
	}
	public static List<ShoppingCartItem> bookCartTwoBooks() {
		List<ShoppingCartItem> shoppingCartItemList = new ArrayList<ShoppingCartItem>();
		ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
		shoppingCartItem.setBookName("Clean Code");
		shoppingCartItem.setQuantity(2);
		shoppingCartItemList.add(shoppingCartItem);
		return shoppingCartItemList;
	}

}
