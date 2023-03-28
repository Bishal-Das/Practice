package Finalonwards33;

interface Abc
{
	void show();
}
class Impl implements Abc
{
	public void show() {
		System.out.println("PRINT");
	}
	
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		
		Abc obj = new Impl();
		obj.show();
//		Writer p = new Pen();
//		Writer pc = new Pencil();
//		
//		p.write();
//		pc.write();
//		
//		Kit k = new Kit();
//		k.doit(p);
//		k.doit(pc);
		
	}

}
