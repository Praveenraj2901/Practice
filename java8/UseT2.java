package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UseT2 {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(2,3,4,25,44,26,33);
		T2 a =(w)->{
			if(Collections.min(nums)%2==0) {
				System.out.println(Collections.min(nums)+" is Even");
			}
			else {
				System.out.println(Collections.min(nums)+" is odd");
			}
		};
		a.findMin(nums);
		System.out.println(T2.name());
		System.out.println(a.end());
	}

}
