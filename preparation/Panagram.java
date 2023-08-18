package preparation;

public class Panagram {
	public static void main(String[] args) {
		String a = "abcdefghijklmnopqrstuvwxyz";
		String temp = "";
		for(char i ='a'; i<='z'; i++) {
			if(a.indexOf(i)!=-1) {
				temp = temp+i;
			}
			
		}
		if(temp.length()==26) {
			System.out.println("is Panagram");
		}
		else {
			System.out.println("is not Panagram");
		}
		
	}
	

}
