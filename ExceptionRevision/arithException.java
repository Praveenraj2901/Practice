package ExceptionRevision;

public class arithException {
	public static void main(String[] args) {
		try {
			int a = 10/0;
			System.out.println(a);
		}
		catch(ArithmeticException ae) {
			System.out.println("Can't divide by 0");
		}
	}

}
