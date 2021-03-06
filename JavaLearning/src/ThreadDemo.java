//Runnable interface has only one method run
class Hi1 implements Runnable {
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
class Hello1 implements Runnable{
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

public class ThreadDemo {

	//by default main thread will be in execution
	public static void main(String[] args) {
		Runnable obj1=new Hi1();
		Runnable obj2=new Hello1();
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
