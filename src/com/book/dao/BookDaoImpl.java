/**
 * 
 */
package com.book.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import com.book.bean.Book;

/**
 * @author sayali martal1
 *
 */

//Class for book DAO operations
public class BookDaoImpl implements BookDao {
	
	private TreeSet<Book> books = new TreeSet<>();
	private Map<Integer,Book> cartItems = new HashMap<>();
	private int cartCount=0;
	
	Book booka=new Book(100,"Wise and Otherwise","Sudha Murthy","It takes you to a journey across the length and breadth of India through narrations of 51 stories inspired by the extensive travels of the author herself.",141,"Wise-and-otherwise.jpg",1);
	Book bookb=new Book(101,"The Alchemist","Paulo Coelho","The story is about an Andalusian shepherd boy named Santiago who travels from his homeland in Spain to the Egyptian desert in search of a treasure buried in the Pyramids.",410,"The-alchemist.jpg",1);
	Book bookc=new Book(102,"Head First Java","Kathy Sierra and Berth Bates","An interactive and fun approach for better understanding of different fundamentals of Java. ",850,"Head-first-java.jpg",1);
	Book bookd=new Book(103,"Harry Porter and the Prisoner of Azkaban","J. K. Rowling","Everything changes when a mass-murderer going by the name of Sirius Black escapes the wizard prison of Azkaban and he is looking for Harry.",1257,"Harry-potter-and-the-prisoner-of-azkaban.jpg",1);
	Book booke=new Book(104,"Fundamentals of Database Systems","Ramez Elmasri and Shamkant Navathe","It systematically builds on the core fundamental concepts necessary for designing, using and implementing database systems and database applications.",719,"Fundamentals-of-database-systems.jpeg",1);
	
	@Override
	public void addBooks() 	{ //Add books to a TreeSet
		books.add(booka);
		books.add(bookb);
		books.add(bookc);
		books.add(bookd);
		books.add(booke);
	}
	
	@Override
	public TreeSet<Book> viewAllBooks() { //View list of available books
		return books;
	}
	
	public int getCartCount() {  //Retrieve cart count
		return cartCount;
	}
	
	@Override
	public void addBookToCart(int bookId) {  //Add a book to the cart using book id
		boolean flag=true;
		cartCount++;
		for(Book  book: viewCart())
		{
		if(book.getBookId() == bookId) {
			book.setBookCount(book.getBookCount()+1);  //Increment book count if book already in cart
			flag=false;
			break;
		}
		}
		if(flag)  //Else add the book to the cart
			books.stream().forEach(book -> { if(book.getBookId() == bookId) cartItems.put(book.getBookId(), book);});
	}
	
	@Override
	public void deleteBookFromCart(int bookId) {  //Delete book from the cart using book id
		cartCount--;
		for(Book  book: viewCart())
		{
		if(book.getBookId() == bookId) 
		{
			if(book.getBookCount()==1)  //Remove the book from the cart if only one copy present
				cartItems.remove(book.getBookId());
			if(book.getBookCount()>1) {
				book.setBookCount(book.getBookCount()-1); //Decrement book count if book already in cart
			}
			
			break;
		}
		}
		
	}
	
	@Override
	public Collection<Book> viewCart() {  //View cart items
		return cartItems.values();
	}

}
