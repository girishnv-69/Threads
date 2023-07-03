package thread;

class MyThraed5 extends Thread{
	public void run()
	{
		System.out.println("Child Thread Name = " +Thread.currentThread().getName());
	}
}


public class DefaultThread {
	public static void main(String[] args) {
		MyThraed5 myThraed5= new MyThraed5();
		//System.out.println(Thread.currentThread());//Name of Default Thread
		// If we want to chainge the Default Thread Name 
		Thread.currentThread().setName("Girish");
		System.out.println("Main Thrad Name = "+Thread.currentThread() );
		myThraed5.start();

	}

}
