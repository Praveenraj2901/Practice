package dataAbstraction;

public class UseLocalGovernment {
	public static void main(String[] args) {
		LocalGovernment LG = new LocalGovernment();
		System.out.println(LG.headOfTheSystem("State Government"));
		System.out.println(LG.rulingYears("MLA"));
		System.out.println(LG.rulerName("ADMK"));
		
	}

}
