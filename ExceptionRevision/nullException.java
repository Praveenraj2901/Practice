package ExceptionRevision;

public class nullException {
	public static void main(String[] args) {
		String a = null;
		try {
			
			System.out.println(a.toUpperCase());
		}
		catch(NullPointerException npe) {
			System.out.println("Value is null");
		}
	}

}
