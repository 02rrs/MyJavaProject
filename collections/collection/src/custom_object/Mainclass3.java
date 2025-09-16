package custom_object;

import java.util.ArrayList;
import java.util.Collections;

public class Mainclass3 {
	public static void main(String[] args) {
		Mobile m1=new Mobile(101,"Onepluse",50000.0,16);
		Mobile m2=new Mobile(102,"Samsung",50000.0,12);
		Mobile m3=new Mobile(103,"Realme",50000.0,16);
		Mobile m4=new Mobile(104,"Apple",50000.0,12);
		Mobile m5=new Mobile(105,"Redmi",50000.0,18);
		
		ArrayList<Mobile> al=new ArrayList<Mobile>();
		
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		al.add(m5);
		System.out.println("Before Sorting");
		for(Mobile m:al) {
			System.out.println(m);
		}
		Collections.sort(al);
		System.out.println("After Sorting");
		for(Mobile m:al) {
			System.out.println(m);
		}
	}
}
