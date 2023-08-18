package basics;

public final class MyFinal {
	final String name = "Praveenraj";
	//final String name;
	//public MyFinal(String name) {
		//this.name=name;
	//}
	public final void finalMethod() {
		System.out.println("Final method cannot be overridden");
	}
	public static void main(String[] args) {
		MyFinal f = new MyFinal();
		System.out.println(f.name);
		f.finalMethod();
	}

}
