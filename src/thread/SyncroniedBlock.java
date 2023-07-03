package thread;

class Display1{
	public void wish(String name)
	{
		synchronized (this) {
			
		
		for(int i=0;i<5;i++)
		{
			System.out.println("good morning");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
		}
		
	}
}

class MyThreadblock extends Thread{
	Display1 d;
	String name;
	public MyThreadblock(Display1 d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}


public class SyncroniedBlock {

	public static void main(String[] args) {
		Display1 d= new Display1();
		MyThreadblock b1= new MyThreadblock(d, "girish");
		MyThreadblock b2= new MyThreadblock(d, "abc");
		b1.start();
		b2.start();
		
	}

}
