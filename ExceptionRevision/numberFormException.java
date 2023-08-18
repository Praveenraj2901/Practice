package ExceptionRevision;

public class numberFormException {
	public static void main(String[] args) {
		String a = "TN61M2989";
		try {
			int b = Integer.parseInt(a);
			System.out.println(b);
		}
		catch(NumberFormatException nfe) {
			System.out.println("Can't change from String to Integer");
		}
	}

}
