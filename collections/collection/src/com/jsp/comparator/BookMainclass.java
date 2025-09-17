package com.jsp.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class BookMainclass {
	public static void main(String[] args) {
		Book b1=new Book("Harry Potter","JK Rowling",999.9,2001);
		Book b2=new Book("Rich Dad Poor Dad","Robort Kiyosaki",899.9,2010);
		Book b3=new Book("Trade like me","Rishav Raj Singh",1999.9,2040);
		ArrayList<Book> al=new ArrayList<Book>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		System.out.println("Before sorting");
		for (Book b : al) {
			System.out.println(b);
		}
		
		System.out.println("-------------------------------------------------------");
		Collections.sort(al,new SortByTitleAsc());
		for (Book book : al) {
			System.out.println(book);
		}
		System.out.println("--------------------------------------------------------");
		Collections.sort(al,new SortByAuthorDesc());
		for(Book book:al) {
			System.out.println(book);
		}
	}
}