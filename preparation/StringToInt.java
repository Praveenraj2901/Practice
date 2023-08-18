package preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StringToInt {
	public static void main(String[] args) {

		String h = "2+12-4+8-98+199";

		String[] a = h.split("[+-]");
		String[] b = h.split("\\d+");
		int num = Integer.parseInt(a[0]);
		for (int i = 1; i < a.length; i++) {
			if (b[i].equals("-")) {
				num -= Integer.parseInt(a[i]);
			} else {
				num += Integer.parseInt(a[i]);
			}
		}
		System.out.println(num);

		String[] s = { "Praveen", "Raj", " Sambath", "Raj" };
		List<String> li = Arrays.asList(s);
		Optional<String> a1 = li.stream().distinct().reduce((i, j) -> (i.concat(j)));
		a1.ifPresentOrElse(p -> System.out.println(p), () -> System.out.println("No Value found"));

	}
}
