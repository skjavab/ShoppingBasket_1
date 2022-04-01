package com.app.controller;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.app.BaseTest;
import com.app.entity.Book;
import com.app.services.impl.BookCartServiceImpl;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class BookCartControllerTest extends BaseTest {
	@InjectMocks
	private BookCartController bookCartController;

	@Mock
	private BookCartServiceImpl bookCartService;
    @Test
	public void getAllBooks() {
		List<Book> listofBooks = getBook();
		Mockito.when(bookCartService.getAllBooks()).thenReturn(listofBooks);
		List<Book> actual = bookCartController.getAllBooks();
		Assertions.assertEquals(listofBooks, actual);

	}
}
