package dataAbstraction;

public class OverLoad {
		public static String name() {
			return "Praveenraj";
		}
		public static String name(String a) {
			return a;
		}
		public static void main(String[] args) {
			System.out.println(name());
			System.out.println(name("Ajith"));
		}

}
