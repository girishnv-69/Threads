package thread;

class MyThread2 extends Thread{
	public void start() {
		System.out.println("start()"); // 
	}
	
	public void run()
	{
		System.out.println("Run()");
	}
}

public class OverlodingOfStartMethod {

	public static void main(String[] args) {
		MyThread2 myThread2= new  MyThread2();
		myThread2.start();// start() will not start the thread and it will call start() normally

	}

}
