package com.book.dao;

import java.util.Collection;
import java.util.TreeSet;

import com.book.bean.Book;

/**
 * @author Sayali Martal
 *
 */
//Interface for DAO
public interface BookDao {

	void addBooks();
	TreeSet<Book> viewAllBooks();
	void addBookToCart(int bookId);
	void deleteBookFromCart(int bookId);
	Collection<Book> viewCart();


}