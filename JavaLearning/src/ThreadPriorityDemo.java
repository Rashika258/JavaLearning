public class ThreadPriorityDemo {
	public static void main(String[] args) throws InterruptedException {

		Thread t1=new Thread(()-> 
		{
			for(int i=1;i<=5;i++) 
			{
				System.out.println("Hiiii "+Thread.currentThread().getPriority());
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
		Thread t3=new Thread(()->{
			for(int i=1;i<=5;i++) 
			{
				System.out.println("Hiii Hello");
				try
				{
					Thread.sleep(500);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		},"HiiHello");
		t1.setName("Hii thread");
		t2.setName("Hello Thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.join();
		t2.join();
		t3.join();
		System.out.println(t1.isAlive());
		System.out.println("good");
	}

}
