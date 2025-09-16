package collection_related_to_list;
import java.util.ArrayList;
import java.util.Collections;
public class Mainclass7 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(40);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
	}
}
