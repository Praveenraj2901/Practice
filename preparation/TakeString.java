package preparation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TakeString {
	public static void main(String[] args) {
		String[] name = {"javaJPA","javaJDBC","java2EE","projavatc","Praveen"};
		List<String> n = Arrays.asList(name);
		String z = n.stream().filter(x->x.substring(0,4).equals("java")).map(x->x.substring(0,4)).findFirst().get();
		System.out.println(z);
	//	List<String> s = n.stream().filter(x->x.contains("java")).collect(Collectors.toList());
		/*
		 * for(String d:s) { if(s.charAt(d.)=='j'&& d.charAt(s+1)=='a'&&
		 * d.charAt(s+2)=='v'&& d.charAt(s+3)) { }
		 * 
		 */
	//	System.out.println(s);
	}

}
