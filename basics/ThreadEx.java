package basics;

public class ThreadEx {
	public static void main(String[] args) {
		String a = "Praveenraj from Jayankondam";
		for(int i = 0; i<a.length(); i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(a.charAt(i));
		}
	/*
	 * for(int i = 0; i<a.length(); i++) { try { Object.class.wait(); } catch
	 * (InterruptedException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } Object.class.notify(); System.out.print(a.charAt(i));
	 * }
	 */}
	
	

}
