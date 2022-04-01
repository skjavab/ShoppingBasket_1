package com.app;

import java.util.ArrayList;
import java.util.List;

import com.app.entity.Book;

public class BaseTest {
	
	public static final int ID_1 = 1;

	public List<Book> getBook() {

		List<Book> listBooks = new ArrayList<Book>();
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
}
