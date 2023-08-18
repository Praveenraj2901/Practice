package preparation;

import java.util.Scanner;

public class NumWithoutLoop {
	   public static void printNumbers(int number) {
	        if (number <=10) {
	            System.out.println(number);
	            printNumbers(number + 1);
	        }
	    }

	    public static void main(String[] args) {
	    	Scanner s = new Scanner(System.in);
	    	System.out.println("Enter the Number : ");
	        int startNumber = s.nextInt();
	        printNumbers(startNumber);
	    }
}
