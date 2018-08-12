package com.book.service;

import java.util.Collection;
import java.util.TreeSet;

import com.book.bean.Book;
import com.book.dao.BookDaoImpl;

/**
 * @author Sayali Martal
 *
 */
//Class for book Service operations
public class BookServiceImpl implements BookService {
	
	BookDaoImpl dao = new BookDaoImpl();
	
	
	public int getCartCount() {          //View cart count
		return dao.getCartCount();  
	}
	
	/* (non-Javadoc)
	 * @see com.book.service.BookService#addBooks()
	 */
	@Override
	public void addBooks() {
		dao.addBooks();
	}
	
	/* (non-Javadoc)
	 * @see com.book.service.BookService#viewAllBooks()
	 */
	@Override
	public TreeSet<Book> viewAllBooks() {  //View list of all books
		return dao.viewAllBooks();
	}
	
	/* (non-Javadoc)
	 * @see com.book.service.BookService#addBook(com.book.bean.Book)
	 */
	@Override
	public void addBookToCart(int bookId) {  //Add a book to the cart
		dao.addBookToCart(bookId);
	}
	
	/* (non-Javadoc)
	 * @see com.book.service.BookService#deleteBook(com.book.bean.Book)
	 */
	@Override
	public void deleteBookFromCart(int bookId) {  //Remove a book from the cart
		dao.deleteBookFromCart(bookId);
	}
	
	/* (non-Javadoc)
	 * @see com.book.service.BookService#viewCart(com.book.bean.Book)
	 */
	@Override
	public Collection<Book> viewCart() {  //View Cart items
		return dao.viewCart();
	}

}