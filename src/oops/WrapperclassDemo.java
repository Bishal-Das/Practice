package oops;


public class WrapperclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5; //primitive data type
		Integer ii = new Integer(5); // reference variable - wrapper class - Boxing
		
		int j = ii.intValue();  //unwrapping - unboxing
		
		Integer value = i;  //Autoboxings
		
		int k = value;
		
		String str = "123";
		int n = Integer.parseInt(str);
		System.out.println(n);
	}

}
