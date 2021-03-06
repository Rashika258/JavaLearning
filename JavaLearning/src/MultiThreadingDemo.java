//everything is thread in java, to see how it is executed use thread.sleep()
//thread.sleep() --> makes method to sleep for some time
class Hi extends Thread{
	//run can be used for parallel processing
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hiiii");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Hello extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

public class MultiThreadingDemo {

	//by default main thread will be in execution
	public static void main(String[] args) {
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		//start() is built in method 
		//start() by default calls internal run() method so change user defined show() to run() method
		
		obj1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();
		//to properly execute parallel processing use thread in between
//		obj1.show();
//		obj2.show();
		System.out.println("good");
	}

}
