package java8;

import java.util.List;

@FunctionalInterface
public interface T2 {
	public static String name() {
		return "Praveen";
	}
	public default String end() {
		return "Bye";
	}
	public void findMin(List<Integer> nums);
	

}
