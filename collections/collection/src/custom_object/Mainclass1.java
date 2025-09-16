package custom_object;

import java.util.ArrayList;

public class Mainclass1 {
	public static void main(String[] args) {
		Student s1=new Student(1,"Rishav",88.9);
		Student s2=new Student(1,"Rishi",82.9);
		Student s3=new Student(1,"Abhi",98.9);
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		for(Student s:al) {
			System.out.println(s);
		}
	}
}
