package multithreading;

public class MuthiThreadMain {

	public static void main(String[] args) {

		Thread t1 = new MyThreadUsingThread();
		t1.start();
		Thread t2 = new Thread(new MyThreadUsingRunnable());
		t2.start();

	}

}
