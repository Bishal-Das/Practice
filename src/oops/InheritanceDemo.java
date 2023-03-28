package oops;
class A    //Super/Parent
{
	public A()
	{
		System.out.println("..A");
	}
	public A(int i) {
		System.out.println("int A");  //method overloading
	}
	public int add(int i, int j)
	{
		return i+j;
	}
}
class B extends A    //sub  IS-A
{
	public B()
	{
		super(5);
		System.out.println("..B");
	}
	public B(int i) {
		super(i);
		System.out.println("int B");
	}
	public int sub(int i, int j)
	{
		return i-j;
	}
}
class C extends B    //sub   IS-A
{
	public C()
	{
		super();
		System.out.println("..C");
	}
	public C(int i)
	{
		super();
		System.out.println("int C");
	}
	public int mul(int i, int j)
	{
		return i*j;
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
//		C n = new C();      //HAS-A
//		int a = n.add(6,3);
//		int b = n.sub(6,3);
//		int c = n.mul(6,3);
//		
//		System.out.println(a +" "+ b + " "+c);
		C x = new C(5);
		
	}

}
