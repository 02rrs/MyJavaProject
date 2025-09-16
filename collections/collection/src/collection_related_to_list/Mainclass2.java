package collection_related_to_list;
import java.util.ArrayList;
public class Mainclass2 {
	public static void main(String[] args) {
		ArrayList bag1=new ArrayList();
		bag1.add("Apple");
		bag1.add("Mango");
		bag1.add("Grapes");
		System.out.println(bag1);
		
		ArrayList bag2=new ArrayList();
		bag2.add("Banana");
		bag2.add("Grapes");
		bag2.add("JackFruit");
		bag2.add("Mango");
		System.out.println(bag2);
		
//		bag1.removeAll(bag2);
//		System.out.println(bag1);
//		
//		bag2.removeAll(bag1);
//		System.out.println(bag2);
		
		bag1.retainAll(bag2);
		System.out.println(bag1);
		
		bag2.retainAll(bag1);
		System.out.println(bag2);
		
		bag1.clear();
		System.out.println(bag1);
	}
}