package preparation;

public class Swapping {
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Calling A variable : "+a);
		System.out.println("Calling B Variable : "+b);
	}

}
