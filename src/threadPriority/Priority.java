package threadPriority;

class MyThread extends Thread{
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("ChildThread");
		}
	}
}

public class Priority {
	public static void main(String[] args) {
		MyThread myThread= new MyThread();
		myThread.setPriority(10);
		myThread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("MainThread");
		}
	}
}
