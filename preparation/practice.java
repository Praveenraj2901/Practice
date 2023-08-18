package preparation;

public class practice {
	public String[] rev(String[]name) {
		String[] x = new String[name.length];
		for(int i = 0; i<name.length; i++) {
			String y = name[i];
			String re = "";
			for(int j = y.length()-1; j>=0; i--) {
				re = re+y.charAt(i); 
			}
			x[i] = re; 
		}
		return x;
	}
	

}
