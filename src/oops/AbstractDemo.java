package oops;

abstract class Human  //class should be abstract if method is abstract
{
	public abstract void eat();  // we don't anyone to create object of abstract class
	
	public abstract void walk();  //class should be abstract if method is abstract
	
//	public void show(Integer i)
//	{
//		System.out.println(i);
//	}
//	public void show(Double d)   //method overloading
//	{
//		System.out.println(d);
//	}
	//Instead of 2 methods we can create 1 method
	public void show(Number i)
	{
		System.out.println(i);
	}
	
}
class Man extends Human
{
	public void eat()   //abstract methods of super class needs to be implemented
	{
		
	}
	public void walk() {
		
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
//		Human x = new Human(); // abstract class object cannot be created
		Human x = new Man();
		x.show(5.5);
	}

}
