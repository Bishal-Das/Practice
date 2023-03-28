package oops;

class Student
{
	private int roll;
	private String name;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
//Binding data with methods
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		//Binding data with methods - Encapsulation
		s1.setName("Bishal");
		s1.setRoll(2);
		System.out.println(s1.getName());
		System.out.println(s1.getRoll());
	}

}
