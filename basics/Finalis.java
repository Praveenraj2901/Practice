package basics;

public class Finalis {
	String value;
	public void finalize() {
		System.out.println("Garbage Collected");
		
	}
	public Finalis(String value) {
		this.value = value;
	}
	public static void main(String[] args) {
		Finalis f = new Finalis("Hello");
		System.out.println(f.hashCode());
		f = new Finalis("Hello world");
		System.gc();
		System.out.println(f.hashCode());
	}

}
