
interface A{
	void show(int i);
}
//class Xyz implements A
//{
//	public void show() {
//		System.out.println("hello");
//	}
//}
public class LambdaDemo {

	public static void main(String[] args) {
		A obj;
//		obj = new Xyz();
//		obj = new A()  //Anonymous inner class
//				{
//					public void show()
//					{
//						System.out.println("Hello");
//					}
//				};
		
//		obj = (int i) -> System.out.println("hello" + i);
		obj = i -> System.out.println("hello" + i);
		obj.show(6);
	}

}
