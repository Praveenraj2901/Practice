package preparation;

public class IntArrToInt {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
			int temp = 0;
			for(int numbers: nums) {
				temp = temp*10+numbers;
			}
			System.out.println(temp);
		}
	

}
