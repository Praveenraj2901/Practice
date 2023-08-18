package basics;

public class MyThread extends Thread {
	public void run() {
		String a = "Praveenraj";
		for(int i = 0; i<a.length(); i++) {
			try {
				sleep(5);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.print(a.charAt(i));
		}
	}
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.start();
		t2.start();
		t3.start();
	}

}
