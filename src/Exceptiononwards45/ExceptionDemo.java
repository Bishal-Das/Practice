package Exceptiononwards45;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x =8;
			int y = 9;
			int k = x/y;
			if ( k == 0)
				throw new MyException("Nope");
			int a[] = new int[6];
			a[6] = 8;
			int i = 9/0;
			
			
			
			
			System.out.println("Try");
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Error");
		}
		catch(Exception e)
		{
			System.out.println("Something wrong");
		}
		finally
		{
		System.out.println("Bye");
		}
	}

}
