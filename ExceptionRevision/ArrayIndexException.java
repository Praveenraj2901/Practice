package ExceptionRevision;

public class ArrayIndexException {
	public static void main(String[] args) {
		String[] a = {"raj","ram","john"};
		try {
			System.out.println(a[0]+a[4]);
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			
			System.out.println("Index out of bound");
			System.exit(0);
		}
	}

}
