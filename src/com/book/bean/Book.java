package com.book.bean;

/**
 * @author Sayali Martal
 *
 */
//Class Book with book attributes
public class Book implements Comparable<Book>{
	//Instance members
	private int bookId;
	private String bookName;
	private String authorName;
	private String description;
	private int price;
	private String bookImg;
	private int bookCount;

	//Parameterized constructor
	public Book(int bookId, String bookName, String authorName, String description, int price, String bookImg,
			int bookCount) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.description = description;
		this.price = price;
		this.bookImg = bookImg;
		this.bookCount = bookCount;
	}

	//Getters and setters
	public int getBookId() {
		return bookId;
	}
	
	public String getBookName() {
		return bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getDescription() {
		return description;
	}

	public int getPrice() {
		return price;
	}

	public String getBookImg() {
		return bookImg;
	}

	public int getBookCount() {
		return bookCount;
	}

	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Book book) {
		return this.bookName.compareTo(book.bookName);
	}

	//Display book details
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + ", description=" + description + ", price="
				+ price + ", bookId=" + bookId + ", bookCount=" + bookCount + "]";
	}

}