package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.common.constant.ApiConstant;
import com.app.entity.Book;
import com.app.entity.BooksDiscountDetails;
import com.app.model.ShoppingCartItem;
import com.app.services.BookCartService;

@RestController
@RequestMapping("/api")
public class BookCartController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	BookCartService service;

	@GetMapping(value = ApiConstant.APPI_URL, produces = "application/json")
	public List<Book> getAllBooks() {

		List<Book> books = new ArrayList<>();
		log.info("Getting book details from the database.");
		books = service.getAllBooks();
		return books;
	}

	@GetMapping(value = ApiConstant.DISCOUNT_URL, produces = "application/json")
	public List<BooksDiscountDetails> getAllBookDiscountDetails() {

		log.info("Getting book details from the database.");
		return service.getAllBookDiscountDetails();
	}

	@PostMapping(value = ApiConstant.CALCULATEPRICE_URL)
	public double calculatePrice(@RequestBody List<ShoppingCartItem> shoppingCartItem) {

		log.info("Saving book details in the database.");

		return service.calculatePrice(shoppingCartItem);
	}
}
