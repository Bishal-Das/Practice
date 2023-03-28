class Calc1
{
	public int add(int ...n) //variable length arguments
								//any numbers of arguments
	{
		int sum = 0;
		for(int i : n)
		{
			sum = sum + i;
		}
		return sum;
	}
}
public class VarargsDemo {

	public static void main(String[] args) {
		Calc1 obj = new Calc1();
		System.out.println(obj.add(1, 2));
	}
}
