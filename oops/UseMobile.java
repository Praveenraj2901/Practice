package oops;

public class UseMobile {
	public static void main(String[] args) {
		Battery b1 = new Battery("Removable",1000,6000);
		
		Display d1 = new Display("AMOLED",5.5f,3500);
		
		Processor p1 = new Processor("Snapdragon","836S");
		
		Mobile m = new Mobile("OnePlus",30000, b1, d1, p1);
		
		System.out.println(m);
		
		System.out.println("-----------------------------------");
		
		System.out.println(m.processor);
		
		System.out.println("-----------------------------------");
		
		System.out.println(m.battery);
		System.out.println("-----------------------------------");
		System.out.println(m.display);
	}

}
