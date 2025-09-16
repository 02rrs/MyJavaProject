package collection_related_to_list;

import java.util.ArrayList;
import java.util.ListIterator;

public class Practice1 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(30);
		
		al2.add(30);
		al2.add(40);
		al2.add(60);
		al2.add(70);
		
		System.out.println(al.contains(50));
		System.out.println(al.contains(100));
		System.out.println(al.indexOf(30));
		System.out.println(al.lastIndexOf(30));
//		al.removeAll(al2);
//		System.out.println(al);
//		al.retainAll(al2);
//		System.out.println(al);
		ListIterator<Integer> li=al.listIterator(al.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}