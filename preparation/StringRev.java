package preparation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringRev {
	public static void main(String[] args) {
		String s = "java is a programming language";
		
		String[] st = s.split(" ");
		String temp;
		String x = "";
		for(int i = 0; i<st.length; i++ ) {
			for(int j = i+1; j<st.length; j++) {
			if(st[i].length()>st[j].length()) {
				temp =st[i];
				st[i]=st[j];
				st[j] = temp;
			}
				
				
			}
		}
		for(int i = 0; i<st.length; i++) {
			x = x+st[i]+" ";
		}
		System.out.println(x);
		
		Arrays.stream(s.split(" ")).sorted().forEach(y->System.out.print(y+" "));
	}

}
