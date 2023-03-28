class Outer 
{
	int a;
	public void show()
	{	
	}
	static class Inner //member class //static class//Outer$Inner.class
	{
		public void display()
		{
			System.out.println("inner display");
		}
	}
}
public class InnerDemo {
	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj1 = new Outer.Inner(); //for static class
	//	Outer.Inner obj1 = obj1.new Inner();  //for member class
		obj1.display();
	}

}
