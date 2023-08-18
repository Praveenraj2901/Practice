package interviewTasks;

import java.util.Scanner;

public class NumToWord {
	    // Arrays to store the word representation of digits and teens
	    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	    private static final String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	    private static final String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

	    // Function to convert a number to its word representation
	    public static String convertToWord(int number) {
	        if (number == 0) {
	            return "zero";
	        }

	        String word = "";
	        int length = (int) Math.log10(number) + 1; // Get the number of digits in the number

	        for (int i = length; i > 0; i--) {
	            int digit = number / (int) Math.pow(10, i - 1) % 10;
	            if (i == 2 && digit == 1) { // Check for teens
	                int nextDigit = number % 10;
	                word += teens[nextDigit] + " ";
	                i--; // Skip the next iteration (teen numbers have two digits)
	            } else {
	                word += ones[digit] + " ";
	            }

	            if (i == 4) { // Thousands
	                word += "thousand ";
	            } else if (i == 3) { // Hundreds
	                word += "hundred ";
	            } else if (i == 1) { // Single digits
	                if (length > 2 && number % 100 != 0) {
	                    word += "and ";
	                }
	            }
	        }

	        return word.trim(); // Remove leading/trailing spaces and return the final word representation
	    }

	    public static void main(String[] args) {
	    	Scanner s = new Scanner(System.in);
	    	System.out.println("Enter the number : ");
	        int number = s.nextInt();
	        String wordRepresentation = convertToWord(number);
	        System.out.println(number + " in words: " + wordRepresentation);
	    }
	}


