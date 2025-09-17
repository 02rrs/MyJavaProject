package com.jsp.comparator;

import java.util.Comparator;

public class SortBySIzeDesc implements Comparator{
	@Override
	public int compare(Object o1,Object o2) {
		Shirt s1=(Shirt)o1;
		Shirt s2=(Shirt)o2;
		return (-1*(s1.brand.compareTo(s2.brand)));
	}
}
