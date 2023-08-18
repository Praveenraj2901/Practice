package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionExample {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2,3,4,45,67,23);
		Integer des = list1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(des);
		Collections.sort(list1);
		System.out.println(list1);
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list1);
		System.out.println(Collections.max(list1));
		System.out.println(Collections.min(list1));
		Collections.unmodifiableList(list1);
		System.out.println(list1);
		
		
	//	list1.add(82);
	}

}
