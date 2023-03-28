package Finalonwards33;
class AB
{
	public void show()
	{
		System.out.println("A");
	}
}
public class AnonymousclassDemo {

	public static void main(String[] args) {
		AB obj = new AB()
				{      //class that doesn't have a name, but implementation
					public void show()
					{
						System.out.println("B");
					}
				};
				
		
		obj.show();
		

	}

}
