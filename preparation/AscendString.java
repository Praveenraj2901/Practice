package preparation;

public class AscendString {
	public static void main(String[] args) {
		String a = "abdecf";
		char[] c = a.toCharArray();
		char temp;
		String n = "";
		for(int i = 0; i<c.length; i++) {
			for(int j = i+1; j<c.length; j++) {
				if(c[i]>c[j]) {
					temp = c[i];
					c[i]=c[j];
					c[j]=temp;
					//n=n+c[j];
				}
			}
		}
		for(int i = 0; i<a.length(); i++) {
			n=n+c[i];
		}
		System.out.println(n);
		
		
		for(int i = 0; i<c.length; i++) {
			for(int j = i+1; j<c.length; j++) {
				if(c[i]>c[j]) {
					temp = c[i];
					c[i]=c[j];
					c[j]=temp;
					//n=n+c[j];
				}
			}
		}
	}

}
