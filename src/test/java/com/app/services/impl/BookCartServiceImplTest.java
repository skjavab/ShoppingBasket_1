
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
import com.app.repository.BookRepository;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class BookCartServiceImplTest extends BaseTest{
	@InjectMocks
	private BookCartServiceImpl bookCartService;

	@Mock
	private BookRepository bookRepository;

	@Test
	public void getAllBooks() {
		List<Book> listofBooks=getBook();
		Mockito.when(bookRepository.findAll()).thenReturn(listofBooks);
		List<Book> actual= bookCartService.getAllBooks();
		Assertions.assertEquals(listofBooks, actual);
	}
}
