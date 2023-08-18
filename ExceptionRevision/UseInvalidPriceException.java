package ExceptionRevision;

import java.util.Scanner;

import basics.InvalidPriceException;

public class UseInvalidPriceException {
	public static void main(String[] args)throws InvalidPriceException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Price");
		int price = s.nextInt();
		if(price<0) {
			throw new InvalidPriceException("Price is not valid");
			}
		else {
			System.out.println("Price : "+price);
		}
		
	}

}
