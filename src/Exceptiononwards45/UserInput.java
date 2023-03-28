package Exceptiononwards45;

import java.util.Scanner;

public class UserInput {
	public static void main(String args[])
	{
		int n=0;
		
		Scanner sc = new Scanner(System.in);   //System.in means getting input from keyboard
		try {
		n = sc.nextInt();
		System.out.println("Value " +n);
		}
		catch(Exception e)
		{
			System.err.println("Error");
		}
		finally {
			System.out.println("Value not found");
		}
		
		
	}
}
