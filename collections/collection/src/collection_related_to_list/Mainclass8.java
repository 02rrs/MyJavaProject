package collection_related_to_list;

import java.util.ArrayList;
import java.util.Collections;

public class Mainclass8 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Blue");
		al.add("Yellow");
		al.add("Red");
		al.add("Black");
		System.out.println(al);
		System.out.println("-----------------------------");
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
	}
}
