package com.jsp.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ShirtMainclass {
	public static void main(String[] args) {
		Shirt s1=new Shirt(101,"Zara",42,9999.0);
		Shirt s2=new Shirt(102,"HNM",40,5999.9);
		Shirt s3=new Shirt(103,"Peter England",44,8999.9);
		ArrayList<Shirt> al=new ArrayList<Shirt>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println("Before sorting");
		for (Shirt shirt : al) {
			System.out.println(shirt);
		}
		
		System.out.println("-------------------------------------------------------");
		Collections.sort(al,new SortBySizeAsc());
		for (Shirt shirt : al) {
			System.out.println(shirt);
		}
		System.out.println("--------------------------------------------------------");
		Collections.sort(al,new SortByBrandAsc());
		for(Shirt shirt:al) {
			System.out.println(shirt);
		}
	}
}