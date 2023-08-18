package preparation;

public class FirstDuplicate {
	public static void findfirstDuplicate(int[] nums) {
		int count;
		for(int i: nums) {
			count=0;
			for(int j: nums) {
				if(j==i) {
					count++;
				}
			}
			if(count>0) {
			System.out.println(i);
			}
			
		}
	}
	public static void finddup(int[] a,int[] b) {
		int count;
		for(int i = 0; i<a.length; i++) {
			count = 1;
			for(int j = 0; j<b.length; j++) {
				if(a[i]==b[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.print(a[i]+" ");
			}
		}
		
	}
	public static void findNondup(int[] a) {
		int count;
		for(int i = 0; i<a.length; i++) {
			count = 1;
			for(int j = i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(a[i]+" ");
			}
		}
		
	}
	public static void main(String[] args) {
		int [] nums = {5,4,3,2,1,4,5,3,2,1};
	//	findfirstDuplicate(nums);
		int[] a = {1,2,3,4,2};
		int[] b = {2,4,5,6};
		//finddup(a, b);
		findNondup(a);
	}

}
