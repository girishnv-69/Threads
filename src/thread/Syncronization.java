package thread;

class Display{
	public synchronized void wish(String name)
	{
		for (int i = 0; i < 5; i++) {
			System.out.println("Good Morning");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}

class MyThreadsy extends Thread
{
	Display d;
	String name;
	public MyThreadsy(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}	
}
public class Syncronization {

	public static void main(String[] args) {
		Display d= new Display();
		MyThreadsy s1= new MyThreadsy(d, "girish");
		MyThreadsy s2= new MyThreadsy(d, "abc");
		s1.start();
		s2.start();
	}
}
