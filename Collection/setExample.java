package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setExample {
	public static void main(String[] args) {
	//	Set<Integer> values = new HashSet<>(); // Random
	//	Set<Integer> values = new TreeSet<>(); //Ascending
	//	Set<Integer> values = new LinkedHashSet<>(); //insertion order
	//	Collections.addAll(values,1,2,45,67,87,43,23);
	//	System.out.println(values);
		
		Set<String> value = new LinkedHashSet<>();
		Collections.addAll(value, "Praveenraj","Venkatesh","Raja");
		System.out.println(value);
		
	}

}
