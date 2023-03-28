package Exceptiononwards45;

public class ThreadLamdaDemo {
	public static void main(String args[]) throws Exception
	{
		Thread t1 = new Thread(() ->
		{
			for(int i=1; i<=5; i++) {
			System.out.println("Hi");
			try { Thread.sleep(300); } catch(Exception e) {}
			}
		});
		
		Thread t2 = new Thread(() ->
		{
			for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			try { Thread.sleep(300); } catch (Exception e) {}
				}
		});
		t1.setPriority(1);
		t2.setPriority(10);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.start();
		try { Thread.sleep(10);} catch(Exception e){}
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println("Bye");
//		obj1.start();
//		try { Thread.sleep(10);} catch(Exception e){}
//		obj2.start();
		
	}
}
