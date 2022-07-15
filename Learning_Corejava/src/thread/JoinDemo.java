package thread;


class ThreadJoin extends Thread
{
	public void run()
	{
		Thread th = Thread.currentThread();
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(th.getName()+" : "+i);
		}
	}
}

public class JoinDemo
{
	public static void main(String[] args)
	{
		
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		ThreadJoin t3 = new ThreadJoin();
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		
	}
}
