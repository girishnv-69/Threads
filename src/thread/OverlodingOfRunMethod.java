package thread;

class MyThread1 extends Thread{
	public void run()
	{
		System.out.println("runmethod");
	}
	public void run(int a)
	{
		System.out.println("Overloding run method");
	}
}
public class OverlodingOfRunMethod {
	public static void main(String[] args) {
		MyThread1 myThread1= new MyThread1();
		myThread1.start();
		myThread1.run(10);// we have to call separately 
			System.out.println("Main Thread");
		
	}
}
