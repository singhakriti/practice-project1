package synchronization;
class Display {

	public synchronized void wish(String name) {
		for (int i = 0; i <= 1; i++) {
			System.out.println("Welcome :: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			System.out.println(name);
		}
	}

}

class MyThread extends Thread {
	Display d;
	String name;

	public MyThread(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}


public class Synchronization {

	public static void main(String[] args) {
		Display d1 = new Display();
		MyThread mt1 = new MyThread(d1, "MSD");
		MyThread mt2 = new MyThread(d1, "Yuvraj");
		mt1.start();
		mt2.start();

	}

}
