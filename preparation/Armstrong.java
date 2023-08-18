package preparation;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num");
		int num = s.nextInt();
		int temp;
		temp = num;
		int rem;
		int sum = 0;
		int len = (int)(Math.log10(num)+1);
		
		while(temp!=0) {
		rem = temp%10;
		sum = sum+(int)Math.pow(rem, len);
		temp = temp/10;
		}
		if(sum == num) {
	//		System.out.println("Armstrong");
		}
		else {
	//		System.out.println("Not an Armstrong");
		}
		
		System.out.println("Enter n1");
		int n1 = s.nextInt();
		int temp1;
		temp1 = n1;
		int rem1;
		int sum1 = 0;
		
		while(temp1!=0) {
			rem1 = temp1%10;
			sum1 = sum1+rem1*rem1*rem1;
			temp1 = temp1/10;
		}
		if(sum1==n1) {
			System.out.println("armsNo.");
		}
		else {
			System.out.println("Not an ArmsNo");
		}
		
		
	}

}
