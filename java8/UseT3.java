package java8;

public class UseT3 {
	public static void main(String[] args) {
		T3palind a = new T3palind();
		T3 b = a::checkPalindrome;
		a.checkPalindrome("madam");
		b.checkPalindrome("dog");
	}

}
