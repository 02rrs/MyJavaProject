package custom_object;

import java.util.ArrayList;
import java.util.Collections;

public class Mainclass2 {
	public static void main(String[] args) {
		Product p1=new Product(1,"Mobile",40000.0);
		Product p2=new Product(2,"Laptop",100000.0);
		Product p3=new Product(3,"WashingMech",20000.0);
		
		ArrayList<Product> al=new ArrayList<Product>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		
		System.out.println("Befor sorting");
		for(Product p: al) {
			System.out.println(p);
		}
		
		Collections.sort(al);
		
		System.out.println("After Sorting");
		for (Product p : al) {
			System.out.println(p);
		}
	}
}