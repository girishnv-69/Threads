package threadPriority;

class MyThread6 extends Thread{
	
}

public class ThreadPriority {
	public static void main(String[] args) {
	System.out.println(Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(6);
	System.out.println(Thread.currentThread().getPriority());
//	Thread.currentThread().setPriority(16);
//	System.out.println(Thread.currentThread().getPriority());//Exception

	MyThread6 myThread6= new MyThread6();
	System.out.println(myThread6.getPriority());// Priority of childThread will Inherited from the Parent Child
	}

}
