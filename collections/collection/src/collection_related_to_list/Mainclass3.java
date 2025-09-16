package collection_related_to_list;
import java.util.ArrayList;
public class Mainclass3 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		 al.add(10);
		 al.add("Hi");
		 al.add("Hello");
		 al.add(10.11);
		 al.add(null);
		 
		 System.out.println(al.contains(10.11));//true
		 System.out.println(al.contains("Hello"));
		 System.out.println(al.contains("Bye"));
		 
		 System.out.println(al.indexOf(10));
		 System.out.println(al.indexOf("Hello"));
		 System.out.println(al.lastIndexOf(10.11));
		 
		 ArrayList al2=new ArrayList();
		 al2.add(10);
		 al2.add("Hello");
		 System.out.println(al.containsAll(al2));
		 System.out.println(al2.contains(al));
	}
}
