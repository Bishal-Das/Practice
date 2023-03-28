class Calc{
	
	int n1;    //variables
	int n2;
	int result;
	//default constructor assigns value
	public Calc()
	{
		n1=5;
		n2=5;System.out.println("cons");
	}
	public Calc(int n1, int n2) //Constructor overloading
	{
		this.n1 = n1;
		this.n2 = n2;
	}
	public void perform()  //method 
	{
		result = n1 + n2;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		Calc obj = new Calc(7,5);  //getting object
//		obj.n1 = 3;
//		obj.n2 = 5;
//		obj.perform();
		System.out.println(obj.n1);
		System.out.println(obj.n2);
		
		

	}

}
