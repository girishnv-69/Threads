package thread;

class MyThread3 implements Runnable{
	@Override
	public void run() {
	System.out.println("Child Thread");
	}	
}
public class DefiningThreadByImplementingRunnableInterface {
	public static void main(String[] args) {
		MyThread3 myThread3= new MyThread3();
		Thread thread= new Thread(myThread3);
		thread.start();
		System.out.println("Main Thread");
	}
}
