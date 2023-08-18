package ExceptionRevision;

public class stringIndexException {
	public static void main(String[] args) {
		String a = "Praveen";
		try {
			System.out.println(a.charAt(a.length()+2));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Index not found");
		}
	}

}
