package preparation;

import java.util.Arrays;
import java.util.List;

public class CountSpace {
	public static void main(String[] args) {
		String[] values = {"Rajesh"," ","Samuel"," ","Raj"};
		
		List<String> li  = Arrays.asList(values);
		
		Long counts = li.stream().filter(x->x.contains(" ")).count();
		System.out.println(counts);
		List<String> s = li.stream().filter(x->x!=" ").toList();
		Long count = s.stream().count();
		System.out.println(s);
		System.out.println(count);
	}

}
