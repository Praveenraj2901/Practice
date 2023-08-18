package java8;

public class UseT1 {
	public static void main(String[] args) {
		String[]words = {"praveen","gypsy","cdk"};
		T1 a = (w)->{
			
			for(int i = 0; i<words.length; i++) {
				if(words[i].contains("a")||words[i].contains("e")||words[i].contains("i")||words[i].contains("0")||words[i].contains("u")) {
					continue;
				}
				else {
					System.out.println(words[i]);
				}
			}
		};
		a.checkVowel(words);
	}

}
