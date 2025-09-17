package com.jsp.comparator;

public class Book {
	String title;
	String author;
	Double price;
	Integer year;
	public Book(String title, String author, Double price, Integer year) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", year=" + year + "]";
	}
}
