
package com.app.services.impl;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.app.BaseTest;
import com.app.entity.Book;
import com.app.entity.BooksDiscountDetails;
import com.app.repository.BookRepository;
import com.app.repository.BooksDiscountRepository;
import com.app.util.BookCartTestUtil;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class BookCartServiceImplTest extends BaseTest{
	@InjectMocks
	private BookCartServiceImpl service;

	@Mock
	private BookRepository repository;
	
	@Mock
	private BooksDiscountRepository booksDiscountRepository;
	
	@Test
	public void getAllBooks() {
		List<Book> listofBooks = BookCartTestUtil.getBooks();
		Mockito.when(repository.findAll()).thenReturn(listofBooks);
		List<Book> actual= service.getAllBooks();
		Assertions.assertEquals(listofBooks, actual);
	}
	
	@Test
	public void getAllBookDiscountDetails() {
		List<BooksDiscountDetails> listofBooksDiscounts = BookCartTestUtil.getBooksDiscountDetails();
		Mockito.when(booksDiscountRepository.findAll()).thenReturn(listofBooksDiscounts);
		List<BooksDiscountDetails> actual= service.getAllBookDiscountDetails();
		Assertions.assertEquals(listofBooksDiscounts, actual);
	}
	
}
