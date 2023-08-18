package preparation;

public class CountChar {
	public static void main(String[] args) {
		int max = 256;
		String name = "manimaran";
		
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
			if(find==1) {
				System.out.println("Char Count of "+name.charAt(i)+" is "+count[name.charAt(i)]);
			}
			
		}
	}

}
