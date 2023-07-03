package thread;

class MyThreads extends Thread{
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}
public class MainThread {
	public static void main(String[] args) {
		MyThreads myThread= new MyThreads();
		myThread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
	}
}
