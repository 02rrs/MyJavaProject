package collection_related_to_list;

import java.util.ArrayList;

public class Mainclass1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Hi");
		al.add(10.11);
		al.add(null);
		al.add(null);
		al.add(10);
		System.out.println(al);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		al.add(1,23);
		System.out.println(al);
		
		ArrayList al2=new ArrayList();
		al2.addAll(al);
		System.out.println(al2);
	}
}