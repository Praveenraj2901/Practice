package preparation;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter  the number");
		int num = s.nextInt();
		int a = num;
		int i = 0;
		int j = 0;
		while(a>0) {
			i = a%10;
			j = (j*10)+i;
			a = a/10;
		}
		System.out.println(j);
	}

}
