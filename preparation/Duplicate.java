package preparation;


public class Duplicate {
		public static void findDuplicate(String name) {
			int count;
			char c[] = name.toCharArray();
			for(int i = 0; i<name.length(); i++) {
				count = 1;
				for(int j = i+1; j<name.length(); j++) {
					if(c[i]==c[j]) {
						count++;
						//System.out.println(c[i]);
					}
				}
				if(count>1) {
					System.out.print(name.charAt(i)+" ");
				}
			}
		}
		
		
		public static void findNonDuplicate(String name) {
			int count;
			char c[] = name.toCharArray();
			for(int i = 0; i<name.length(); i++) {
				count = 1;
				for(int j = i+1; j<name.length(); j++) {
					if(c[i]==c[j]) {
						count++;
						c[j]='0';
					}
				}
				if(count<2 && c[i]!='0') {
					System.out.print(name.charAt(i)+" ");
					break;
				}
			}
		}
		public static void countDuplicate(String name) {
			int max = 256;
			int count [] = new int[max];
			for(int i = 0; i<name.length(); i++) {
				count[name.charAt(i)]++;
			}
			char c[] = new char[name.length()];
			for(int i = 0; i<name.length(); i++) {
				c[i] = name.charAt(i);
				int find = 0;
				for(int j = 0; j<=i; j++) {
					if(name.charAt(i)==c[j]) {
						find++;
					}
				}
				if(find>1) {
					System.out.println("Char Count of "+name.charAt(i)+" is "+count[name.charAt(i)]);
				}
			}
		}
		public static void countNonDuplicate(String name) {
			int max = 256;
			int count [] = new int[max];
			for(int i = 0; i<name.length(); i++) {
				count[name.charAt(i)]++;
			}
			char c[] = new char[name.length()];
			for(int i = 0; i<name.length(); i++) {
				c[i] = name.charAt(i);
				int find = 0;
				for(int j = 0; j<=i; j++) {
					if(name.charAt(i)==c[j]) {
						find++;
					}
				}
				if(find<2) {
					System.out.println("Char Count of "+name.charAt(i)+" is "+count[name.charAt(i)]);
					
				}
			}
		}
		
		public static void main(String[] args) {
			System.out.println("\n"+"Duplicate");
			findDuplicate("Praveeenraj");
			System.out.println("\n"+"\n"+"NonDuplicate");
			findNonDuplicate("eraveeenraj");
			System.out.println("\n"+"\n"+"Count Duplicate");
			countDuplicate("Praveenraj");
			System.out.println("\n"+"\n"+"Count NonDuplicate");
			countNonDuplicate("Praveenraj");
		}
}