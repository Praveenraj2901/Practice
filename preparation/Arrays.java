package preparation;
import java.util.*;
public class Arrays {
	public static List<String> revStr(String[]wor) {
		List<String> s = new ArrayList<>();
		for(int i = wor.length-1; i>=0; i--) {
			
			s.add(wor[i]);
		}
		return s;
	}
	public static void main(String[] args) {
		String[] wor = {"Praveenraj","Raj","Ajith"};
		System.out.println(revStr(wor));
	}

}
