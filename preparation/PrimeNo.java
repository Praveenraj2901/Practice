package preparation;

public class PrimeNo {
	public static void main(String[] args) {
		String a = "3@64!43#2.73";
		String [] b = a.split("\\W");
		int[] nums = new int[b.length];
		for(int i = 0;  i<b.length; i++) {
			nums[i] = Integer.parseInt(b[i]);
		
	///	System.out.println(nums[i]);
		}
		
		for(int i = 0; i<nums.length; i++) {
			boolean isPrime=true;
			for(int j = 2; j<nums[i]; j++) {
				if(nums[i]%j==0) {
					isPrime=false;
				}
			}
			if(isPrime) {
			System.out.println("Prime Number : "+nums[i]);	
			}
			else {
				System.out.println("Not a Prime : "+nums[i]);
			}
		}
	}

}
