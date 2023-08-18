package preparation;

import java.util.Arrays;

public class IntegerArrayForLoop {
	public static void main(String[] args) {
		Integer [] nums = {12,34,56,78};
		int max = 0;
		for(int i = 0; i<nums.length; i++) {
			if(max<nums[i]) {
				max = nums[i];
			}
		}
		System.out.println(max);
		
		Integer maxi = Arrays.stream(nums).max(Integer:: compare).get();
		System.out.println(maxi);
	}

}
