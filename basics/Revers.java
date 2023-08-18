package basics;

public class Revers {
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("DOG");
		String rev = "";
		for(int i = name.length()-1; i>=0; i--) {
			rev = rev+name.charAt(i);
		}
		System.out.println(rev);
		System.out.println("----------------String Builder---------------");
		System.out.println(name.reverse());
	}


}
