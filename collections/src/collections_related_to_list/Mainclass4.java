package collections_related_to_list;

import java.util.ArrayList;
import java.util.Iterator;

public class Mainclass4 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Hi");
		al.add("Hello");
		al.add(10.11);
		
		Iterator i=al.iterator();
		System.out.println(i.hasNext());
		System.out.println(i.next());
		i.remove();
		System.out.println(al);
	}
}
