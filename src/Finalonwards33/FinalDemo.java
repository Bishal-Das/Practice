package Finalonwards33;

class A  //final class A - it can't be extended
{
	final int i;   //final(constant) variable
	public A() {
		i = 10;  //now it can't be changed
	}
	public void show()  //final method - can't be overridden
	{
		System.out.println("A");
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		
	}

}
