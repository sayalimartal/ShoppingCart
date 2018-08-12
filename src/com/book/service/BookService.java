package com.book.service;

import java.util.Collection;
import java.util.TreeSet;

import com.book.bean.Book;

/**
 * @author Sayali Martal
 *
 */
//Interface for Service
public interface BookService {
	
	void addBooks();
	TreeSet<Book> viewAllBooks();
	void addBookToCart(int bookId);
	void deleteBookFromCart(int bookId);
	Collection<Book> viewCart();
	int getCartCount();

}