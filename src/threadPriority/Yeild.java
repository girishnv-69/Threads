package threadPriority;

class MyThread1 extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Method");
			Thread.yield();
		}
	}
}

public class Yeild {

	public static void main(String[] args) {
		MyThread1 myThread1= new MyThread1();
		myThread1.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Method");

	
}
		

	}

}
