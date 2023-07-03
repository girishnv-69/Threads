package thread;

class Mythread7 extends Thread{
	static Thread mt;
	public void run()
	{
			try {
				mt.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for(int i=0;i<5;i++)
			{
				System.out.println("Child Thread");
		}
	}
}
public class JoinMethodDemo {
	public static void main(String[] args) throws InterruptedException {
		 Mythread7.mt=Thread.currentThread();
		Mythread7 t= new Mythread7();
		
		t.start();
		t.join();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
	}
}
