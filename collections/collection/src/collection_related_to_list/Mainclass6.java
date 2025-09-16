package collection_related_to_list;

import java.util.ArrayList;

public class Mainclass6 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		for (Integer i : al) {
			System.out.println(i);
		}
		System.out.println("---------------------------------");
		ArrayList al1=new ArrayList();
		al1.add(20);
		al1.add("Hi");
		al1.add(30);
		al1.add(null);
		for(Object o:al1) {
			System.out.println(o);
		}
	}
}
