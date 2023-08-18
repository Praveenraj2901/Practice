package java8;

public class T3palind implements T3{
	public void checkPalindrome(String name) {
		String rev = "";
		for(int i=name.length()-1; i>=0; i--) {
			rev = rev+name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println(name +" is a Palindrome");
		}
		else {
			System.out.println(name +" is not a palindrome");
		}
	}

}
