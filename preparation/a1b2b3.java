package preparation;

public class a1b2b3 {
	public static void main(String[] args) {

		String a = "a1b2c3";
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z' || a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				b = b + a.charAt(i);
			} else {
				int num = Character.getNumericValue(a.charAt(i));
				for (int j = 1; j < num; j++) {
					b = b + a.charAt(i - 1);
				}
			}
		}
		System.out.println(b);

		String a1 = "Praveen";
		System.out.println(a1.hashCode());
		a1 = "Praveenraj";
		System.out.println(a1.hashCode());

		StringBuilder sb = new StringBuilder("Praveen");
		System.out.println(sb.hashCode());
		sb.append("raj");
		System.out.println(sb.hashCode());

		int[] a2 = { 22, 2, 3, 45, 66, 24 };
		String[] a3 = new String[a2.length];
		for (int i = 0; i < a2.length; i++) {
			a3[i] = Integer.toString(a2[i]);
			System.out.println(a3[i]);
		}

		String a9 = "Java is a good language";
		String[] b9 = a9.split(" ");
		String result = "";
		String temp = null;
		for (int i = 0; i < b9.length; i++) {
			for (int j = i + 1; j < b9.length; j++) {
				if (b9[i].length() > b9[j].length()) {
					temp = b9[i];
					b9[i] = b9[j];
					b9[j] = temp;
				}
			}
		}
		for (int i = 0; i < b9.length; i++) {
			result = result + b9[i] + " ";
		}
		System.out.println(result);

		String as = "RotoR";
		String results = "";
		for (int i = as.length() - 1; i >= 0; i--) {
			results = results + as.charAt(i);
		}
		if (as.equals(results)) {
			System.out.println("is Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		// find non repeating letter
		String ak = "abcdbcd3e@!";
		int[] conts = new int[256];
		for (int i = 0; i < ak.length(); i++) {
			conts[ak.charAt(i)]++;
		}
		for (int i = 0; i < ak.length(); i++) {
			if (conts[ak.charAt(i)] == 1) {
				System.out.println(ak.charAt(i) + "" + conts[ak.charAt(i)]);
			}
		}
	}
}
