package preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumbers {
	public static void main(String[] args) {
		int[] nums = {6,7,8,9,1,};
		
		for(int i = 0; i<10; i++) {
			int c = 0;
			for(int j = 0; j<nums.length; j++) {
				if(i==nums[j]) {
					c++;
				}
			}
			if(c==0) {
				System.out.println(i);
			}
		}
	}

}
