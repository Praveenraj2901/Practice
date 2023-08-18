package preparation;

public class Anagram {
	public static void main(String[] args) {
		String a = "Dog"; a = a.toLowerCase();
		String b = "God"; b = b.toLowerCase();
		if(a.length()!=b.length()) {
			System.out.println(a+" & "+b+" are not an Anagram");
		}
		else {
		char[] ca = a.toCharArray();
		char[] cb = b.toCharArray();
		char catemp;
		char cbtemp;
		String na = "";
		String nb = "";
		for(int i = 0; i<ca.length; i++) {
			for(int j = i+1; j<ca.length; j++) {
				if(ca[i]>ca[j]) {
					catemp = ca[i];
					ca[i] = ca[j];
					ca[j] = catemp;
				}
			}
		}
		for(int i = 0; i<cb.length; i++) {
			for(int j = i+1; j<cb.length; j++) {
				if(cb[i]>cb[j]) {
					cbtemp = cb[i];
					cb[i] = cb[j];
					cb[j] = cbtemp;
				}
			}
		}
		for(int i = 0; i<a.length(); i++) {
			na = na+ca[i];
		}
		System.out.println(na);
		for(int i = 0; i<b.length(); i++) {
			nb = nb+cb[i];
		}
		System.out.println(nb);
		if(na.equalsIgnoreCase(nb)) {
			System.out.println(a+" & "+b+" are an Anagram");
		}
		else {
			System.out.println(a+" & "+b+" are not an Anagram");
		}
		}
		
	}

}
