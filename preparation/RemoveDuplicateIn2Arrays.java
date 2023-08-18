package preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateIn2Arrays {
	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,5};
	    Integer[] b = {2,3,5,6,8};
	    List<Integer> sa = Arrays.asList(a);
		List<Integer> sb = Arrays.asList(b);
		List<List<Integer>> sc = Arrays.asList(sa, sb);
		List<Integer> sd = sc.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println("Remove Duplicate");
		List<Integer> dup = new ArrayList<Integer>();
		sd.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())).forEach((x, y) -> {
			if (y == 1) {
				dup.add(x);
			}
		});
		Object[] u = dup.toArray();
		System.out.println(Arrays.toString(u));
	    
		/*
		 * List<Integer> sa = Arrays.asList(a); Object[]x = sa.toArray();
		 * System.out.println(Arrays.toString(x));
		 */
	    
	    
	    
	    
	 //   for(int i = 0; i<a.length; i++) {
	    
	 //   }
		
		
		/*
		 * Integer[] c = new Integer[a.length+b.length]; for(int c_i = 0,a_i = 0,b_i =
		 * 0; c_i<c.length; c_i++) { if(c_i<a.length) { c[c_i]=a[a_i++]; } else {
		 * c[c_i]=b[b_i++]; } System.out.println(c[c_i]); } int[] d = new int[c.length];
		 * int[] e = new int[c.length]; int count = 0; for(int i = 0; i<c.length; i++) {
		 * for(int j = i+1; j<c.length; j++) { if(c[i]==c[j]) { c[i]=d[i]; count++; }
		 * else { c[i]=e[i]; } } System.out.println(d[i]); } List<Integer> li = new
		 * ArrayList<Integer>(); for(int i =0; i<c.length; i++) { li.add(c[i]); }
		 * System.out.println(li);
		 */
	    
		/*
		 * List<Integer> l1 = Arrays.asList(a);
		 * 
		 * List<Integer> l2 = Arrays.asList(b);
		 * 
		 * l2.retainAll(l1);
		 * 
		 * System.out.println(l2);
		 */
		
		int[] nums = {122,4,7,9,5,6,2};
		List<Integer> max = new ArrayList<Integer>();
		for(int i = 0; i<nums.length; i++) {
			int max1=0;
			for(int j = i+1; j<nums.length; j++) {
				if(nums[j]>max1) {
					max1=nums[j];
				}
			}
			max.add(max1);
		}
		System.out.println(max);
	}

}
