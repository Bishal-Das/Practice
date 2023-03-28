package Exceptiononwards45;

class Counter {
	int count;

	public synchronized void increment() {
		count++;
	}
}
public class SyncDemo {

	public static void main(String[] args) throws Exception{
		Counter c = new Counter();
		Thread t1 = new Thread(() -> {
			{
				for (int i = 0; i < 100; i++)
					c.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			{
				for (int i = 0; i < 100; i++)
					c.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();  //main thread will wait for t1
		t2.join();
		
		System.out.println(c.count);

	}

}
