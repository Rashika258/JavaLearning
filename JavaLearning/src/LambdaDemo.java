

public class LambdaDemo {

	//by default main thread will be in execution
	public static void main(String[] args) {
		Runnable obj1=	()-> 
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
		};
		Runnable obj2=() ->
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
		};
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		//start() will call run() method of runnable interface
		t1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		System.out.println("good");
	}

}
