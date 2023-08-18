package basics;

import java.util.Scanner;

public class InvalidPrice {
	public static void main(String[] args)throws InvalidPriceException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Price");
		int price = s.nextInt();
		try {
			
		if(price<=0) {
			throw new InvalidPriceException("Invalid Price");
		}
		else {
			System.out.println("Valid Price");
		}
		}
		catch (InvalidPriceException ipe) {
			System.out.println("Invalid Price");
		}
		finally {
		System.out.println("Thank you");
		}
		
	}

}
