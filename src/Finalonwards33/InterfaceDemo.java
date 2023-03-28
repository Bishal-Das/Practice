package Finalonwards33;

interface Writer//it's by default abstract class Writer
{
	default void write()
	{
		System.out.println("writing");//in interface we can have all abstract class //no need to write public abstract
	}
}
interface Thing
{
	default void write() {
		System.out.println("writing thing");
	}
}
class Pen implements Writer, Thing   //we can implement multiple interface
{
	public void write() {
		//System.out.println("Pen");
		Thing.super.write();      //can call any method with super
		Writer.super.write();
	}
}
class Pencil implements Writer
{
	public void write() {
		System.out.println("Pencil");
	}
}
class Kit{
	public void doit(Writer p)
	{
		p.write();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Writer p = new Pen();
		Writer pc = new Pencil();
		
		p.write();
		pc.write();
		
		Kit k = new Kit();
		k.doit(p);
		k.doit(pc);
		
	}

}
