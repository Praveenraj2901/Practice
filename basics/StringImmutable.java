package basics;

public class StringImmutable {
	public static void main(String[] args) {
		String w1 = "Raja";
		String w2 = "Raja";
		String w3 = new String("Raja");
		w3.concat("rajan");
		System.out.println(w3);
		System.out.println(w1==w2);
		System.out.println(w2==w3);
		System.out.println(w2.equals(w3));
		//w1 = w1.concat("Sekar");
		System.out.println(w1.hashCode()); 
		System.out.println(w2.hashCode());
		
	}

}
