package questions_practices;
//find the longest common prefix string amongst an array of strings.
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem1 {
	public static void main(String[] args) {
		String[] str= {"flower","fly","flight"};
		if(str.length==0) {
			System.out.println("");
		}
		List<String> l=Arrays.asList(str);
		Collections.sort(l);
		System.out.println(l);
		
		String smallestWord=l.get(0);
		String largestWord=l.get(l.size()-1);
		
		int i=0;
		while(i<smallestWord.length()&&i<largestWord.length()&&smallestWord.charAt(i)==largestWord.charAt(i)) {
			i++;
		}
		System.out.println(smallestWord.substring(0,i));
	}
}
