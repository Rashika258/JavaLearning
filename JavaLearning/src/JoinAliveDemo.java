

public class JoinAliveDemo {
	public static void main(String[] args) throws InterruptedException {

		Thread t1=new Thread(()-> 
		{
			for(int i=1;i<=5;i++) 
			{
				System.out.println("Hiiii");
				try
				{
					Thread.sleep(500);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
	});
		Thread t2=new Thread(() ->
		{
			for(int i=1;i<=5;i++) 
			{
				System.out.println("Hello");
				try
				{
					Thread.sleep(500);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
	});
		//start() will call run() method of runnable interface
		t1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("good");
	}

}
