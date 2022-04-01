package com.app.controller;


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

import com.app.entity.Book;
import com.app.entity.BooksDiscountDetails;
import com.app.model.ShoppingCartItem;
import com.app.services.impl.BookCartServiceImpl;
import com.app.util.BookCartTestUtil;


@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class BookCartControllerTest  {
	@InjectMocks
	private BookCartController bookCartController;
	
	

	@Mock
	private BookCartServiceImpl bookCartService;
    @Test
	public void getAllBooks() {
    	List<Book> listofBooks = BookCartTestUtil.getBooks();
		Mockito.when(bookCartService.getAllBooks()).thenReturn(listofBooks);
		List<Book> actual = bookCartController.getAllBooks();
		Assertions.assertEquals(listofBooks, actual);

	}
    @Test
	public void getAllBookDiscountDetails() {
    	List<BooksDiscountDetails> listofBooksDiscounts = BookCartTestUtil.getBooksDiscountDetails();
		Mockito.when(bookCartService.getAllBookDiscountDetails()).thenReturn(listofBooksDiscounts);
		List<BooksDiscountDetails> actual= bookCartController.getAllBookDiscountDetails();
		Assertions.assertEquals(listofBooksDiscounts, actual);
    }
    
    @Test
    public void normalPriceWhenBuySamecopys(){
    	List<ShoppingCartItem> listofBooks = BookCartTestUtil.bookCart();
    	Mockito.when(bookCartService.calculatePrice(listofBooks)).thenReturn(Double.valueOf("50.0"));
    	Assertions.assertEquals(Double.valueOf("50.0"), bookCartController.calculatePrice(listofBooks));
    	
    }
    
   
	
	
}
