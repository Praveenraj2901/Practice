package basics;

public class Statik {
 static int num=0;
	public static  void getMethod() {
		num++;
		System.out.println("It's a static method called "+num+" times");
	}
	public static void main(String[]args) {
	//	Statik k = new Statik();
		getMethod();
		getMethod();
		getMethod();
	//	Statik.getMethod();
		
		
	}
	static {
		System.out.println("Static block executes before main method");
	}
}
