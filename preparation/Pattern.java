package preparation;

public class Pattern {
	public static void main(String[] args) {
		for(int i = 5; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	for(int i = 0; i<6; i++ ) {
		for(int j =i; j>0; j--) {
			System.out.print(j);
		}
		System.out.println();
	}
	for(int i = 0; i<6; i++ ) {
		for(int j =i; j>0; j--) {
			System.out.print(i);
		}
		System.out.println();
	}
	for(int i = 1; i<6; i++) {
		for(int j = 6-i; j>1; j--) {
			System.out.print(" ");
		}
		for(int k = 1; k<=i; k++) {
			System.out.print(k+" ");
		}
		System.out.println();
	}
	}
}
