package thread;
class MyThread4 extends Thread{
	public void run()
	{
		System.out.println("Child Thread");
	}
}

public class ExceptionInThread {
	public static void main(String[] args) {
			MyThread4 myThread4= new MyThread4(); 
			myThread4.start();
			//myThread4.start();//Again we r calling thread

		
	}

}
