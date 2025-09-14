package collections_related_to_list;

import java.util.ArrayList;
import java.util.ListIterator;

public class Mainclass5 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		ListIterator li=al.listIterator(al.size());//Stey curssor to last index
		System.out.println(li.hasNext());
		System.out.println(li.hasPrevious());
		System.out.println(li.previous());
		System.out.println(li.previous());
		li.set(78);//replaced the last accesed element
		System.out.println(li.previous());
		li.add(90);
		System.out.println(al);
	}
}