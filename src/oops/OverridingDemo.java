package oops;
class Aa{
	public void show()
	{
		System.out.println("..A");
	}
}
class Bb extends Aa{
	@Override     //gives compile time error instead of logical error
	public void show()
	{
	//	super.show();   //also gives A class method
		System.out.println("..B");   //method overriding
	}
}
class Cc extends Aa{
	public void show()
	{
		System.out.println("..C");
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		Bb x = new Bb();
		x.show();
		
		Aa y = new Bb();  //reference of A object of B - method of object (Bb) will work if it is in Aa
		y.show();  //assigning at runtime - runtime polymorphism
		
		y = new Cc();
		y.show();   //dynamic method dispatch - changing the object (changing the call)

	}

}
