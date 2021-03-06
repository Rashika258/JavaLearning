

public class LamdaSimplifiedDemo {

	//by default main thread will be in execution
	public static void main(String[] args) {
		//since obj1 is used for thread class use it directly inside thread obj
//		Runnable obj1=	()-> 
//		{
//				for(int i=1;i<=5;i++) 
//				{
//					System.out.println("Hiiii");
//					try
//					{
//						Thread.sleep(500);
//					} catch (InterruptedException e)
//					{
//						e.printStackTrace();
//					}
//				}
//		};
//		Runnable obj2=() ->
//		{
//				for(int i=1;i<=5;i++) 
//				{
//					System.out.println("Hello");
//					try
//					{
//						Thread.sleep(500);
//					} catch (InterruptedException e) 
//					{
//						e.printStackTrace();
//					}
//				}
//		};
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
		System.out.println("good");
	}

}
