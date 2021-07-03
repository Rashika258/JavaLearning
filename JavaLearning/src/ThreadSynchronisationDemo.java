class Counter {
	int count;
	//to prevent 2 threads from running simultaneosly synchronised
	//holt ctrl and double click to get the methds
	public synchronized void increement() {
		count++;
	}
}
public class ThreadSynchronisationDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter c=new Counter();
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					c.increement();
				}
			}
		});
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					c.increement();
				}
			}
		});
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println("Count "+c.count);
	}

}
