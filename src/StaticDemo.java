class Emp
{
	int eid;
	int salary;
	static String ceo; //same for all object if used static - it'll go into class memory
	
	public Emp() {
		
		eid = 1;
		salary = 2000;
		System.out.println("cons");
	}
	static { //when u load a class
		ceo = "Larry";
		System.out.println("static");
	}
	void show()
	{
		System.out.println(eid + ":" + salary + ":" + ceo );
	}
	
}
public class StaticDemo {

	public static void main(String[] args) {
		Emp navin = new Emp();
		navin.eid = 1;
	//	navin.salary = 4000;
		
		Emp rahul = new Emp();
		rahul.eid = 2;
	//	rahul.salary = 4000;
		
	//	Emp.ceo = "ASD";
		
		navin.show();
		rahul.show();
		
		
	}

}
