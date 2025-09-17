package com.jsp.comparator;

import java.util.Comparator;

public class SortByYearAsc implements Comparator{
	@Override
	public int compare(Object o1,Object o2) {
		Book b1=(Book)o1;
		Book b2=(Book)o2;
		return b1.year.compareTo(b2.year);
	}
}
