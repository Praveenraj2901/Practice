package preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Mutiply {
	public static int getnum(int num) {
		if (num <= 1) {
			return 1;
		} else {
			return (num * getnum(num - 1));
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter first word to check Anagram");
		String a = s.nextLine().toLowerCase();
		System.out.println("Enter Second word");
		String b = s.nextLine().toLowerCase();

		char[] c = a.toCharArray();
		char tempa;
		String a1 = "";
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {

				if (c[i] > c[j]) {
					tempa = c[i];
					c[i] = c[j];
					c[j] = tempa;
				}
			}
		}
		for (int i = 0; i < a.length(); i++) {
			a1 = a1 + c[i];
		}
		char[] d = b.toCharArray();
		char tempb;
		String b1 = "";
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i] > d[j]) {
					tempb = d[i];
					d[i] = d[j];
					d[j] = tempb;
				}
			}
		}
		for (int i = 0; i < b.length(); i++) {
			b1 = b1 + d[i];
		}
		if (a1.equals(b1)) {
			System.out.println(a + " & " + b + " Is Anagram");
		} else {
			System.out.println(a + " & " + b + "Is not an Anagram");
		}
		System.out.println("----------------------------------------------");

		System.out.println("Enter Number to check it is Anagram");
		int num = s.nextInt();
		int temp;
		temp = num;
		int rem;
		int sum = 0;
		int len = (int) Math.log10(num) + 1;
		while (temp != 0) {
			rem = temp % 10;
			sum = sum + (int) Math.pow(rem, len);
			temp = temp / 10;
		}
		if (sum == num) {
			System.out.println(num + " Is an Armstrong Number");
		} else {
			System.out.println(num + " is not an Armstrong Number");
		}
		System.out.println("-----------------------------------------------");

		System.out.println("Enter String for Ascending");
		String x = s.next();
		char[] e = x.toCharArray();
		char tempe;
		String e1 = "";
		for (int i = 0; i < e.length; i++) {
			for (int j = i + 1; j < e.length; j++) {

				if (e[i] > e[j]) {
					tempe = e[i];
					e[i] = e[j];
					e[j] = tempe;
				}
			}
		}
		for (int i = 0; i < x.length(); i++) {
			e1 = e1 + e[i];
		}
		System.out.println(e1);
		System.out.println("-----------------------------------------------");

		System.out.println("Count Spaces");
		String[] input = { "Praveen", "Ajith", " ", "Vinoth", " " };
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i].equals(" ")) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println("---------------------------------------------");

		System.out.println("Fibonacci Series");
		int n1 = s.nextInt();
		int a4 = 0;
		int b4 = 1;
		int c4 = 0;
		for (int i = 0; i < n1; i++) {
			c4 = a4 + b4;
			System.out.println(a4);
			a4 = b4;
			b4 = c4;
		}

		System.out.println("------------------------------------------------");

		System.out.println("Find Missing Number");
		int[] n2 = { 11, 12, 16, 18, 19 };
		for (int i = 11; i < 21; i++) {
			int cont = 0;
			for (int j = 0; j < n2.length; j++) {
				if (i == n2[j]) {
					cont++;
				}
			}
			if (cont == 0) {
				System.out.println(i);
			}
		}
		System.out.println("--------------------------------------------------------------------");

		System.out.println("Enter String like a1b2c3");
		String w = s.next();
		for (int i = 0; i < w.length(); i++) {
			if (w.charAt(i) >= 'a' && w.charAt(i) <= 'z') {
				for (int j = i + 1; j < w.length(); j++) {
					if (w.charAt(j) >= '0' && w.charAt(j) <= '9') {
						int cnt = w.charAt(j) - '0';// conver char to numericvalue;
						for (int k = 0; k < cnt; k++) {
							System.out.print(w.charAt(i));
						}
						break;
					}
				}
			}
		}
		System.out.println("---------------------------------------------------------------------");

		System.out.println("Enter Factorial");
		int k = s.nextInt();
		int mul = 1;
		for (int i = k; i > 0; i--) {
			mul = mul * i;
		}
		System.out.println(mul);
		System.out.println("--------------------------------------------------------------------");

		System.out.println("Find Duplicate");
		String[] t = { "Ram", "Raj", "kamal" };
		String[] r = { "Sam", "Ram", "Praveen", "Arun", "Raj" };
		int dupCount = 0;
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < r.length; j++) {
				if (t[i].equalsIgnoreCase(r[j])) {
					dupCount++;
					System.out.println(t[i]);
				}
			}
		}

		System.out.println("Duplicate Count = " + dupCount);
		System.out.println("---------------------------------------------------------------------");

		System.out.println("Find Non Duplicate");

		List<String> li = new ArrayList<String>();
		int totcount = 0;
		for (int i = 0; i < t.length; i++) {
			int cnts = 0;
			for (int j = 0; j < r.length; j++) {
				if (t[i] == r[j]) {
					cnts++;
				}
			}
			if (cnts == 0) {
				totcount++;
				li.add(t[i]);
			}
		}
		for (int i = 0; i < r.length; i++) {
			int cnts1 = 0;
			for (int j = 0; j < t.length; j++) {
				if (r[i] == t[j]) {
					cnts1++;
				}
			}
			if (cnts1 == 0) {
				totcount++;
				li.add(r[i]);
			}
		}
		System.out.println(li);
		System.out.println("Non Duplicate count = " + totcount);
		System.out.println("---------------------------------------------------------------------");

		System.out.println("Print Prime Numbers");
		int countNoOfPrime = 0;
		for (int i = 0; i <= 100; i++) {
			int countPrime = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					countPrime++;
				}
			}
			if (countPrime == 0) {
				countNoOfPrime++;
				System.out.println(i);
			}
		}
		System.out.println("No of Prime Numbers within given number = " + countNoOfPrime);
		System.out.println("---------------------------------------------------------");

		System.out.println("Pattern programme");
		for (int i = 5; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j >= 0; j--) {
				System.out.print(i);
			}
			System.out.println();
		}

		String str = "Venkatesh";
		ArrayList<String> assstr = Arrays.stream(str.split("")).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(assstr);

		System.out.println("Enter String");
		String st = s.next().toLowerCase();
		String[] arrst = st.split("");
		if (arrst[0].equalsIgnoreCase(arrst[arrst.length - 1])) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}

		System.out.println("Enter string to find repeat");

		String strs = s.nextLine();
		System.out.println("Enter find ");
		String find = s.next();
		String[] arrstrs = strs.split(" ");
		int countFind = 0;
		for (int i = 0; i < arrstrs.length; i++) {
			if (arrstrs[i].contains(find)) {
				countFind++;
			}
		}
		System.out.println(countFind);

		String sa = "praveenraj";
		List<String> sas = Arrays.stream(sa.split("")).sorted().toList();
		String sasjoin = String.join(" ", sas);
		System.out.println(sasjoin);

		String g = "adcaba";
		int[] coun = new int[256];
		for (int i = 0; i < g.length(); i++) {
			coun[g.charAt(i)]++;
		}
		for (int i = 0; i < g.length(); i++) {
			if (coun[g.charAt(i)] > 1) {
				System.out.println(g.charAt(i) + " " + coun[g.charAt(i)]);
				break;
			}
		}
	}
}
