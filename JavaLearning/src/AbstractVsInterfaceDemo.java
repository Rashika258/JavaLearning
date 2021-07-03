abstract class Writer{
	public abstract void write();
}
//if pen1 wants to extend another abstract class to implement another method, it won't be possible because java doesn't support multiple inheritance

//The constructor inside the abstract class can only be called during constructor chaining i.e. when we create an instance of sub-classes. This is also one of the reasons abstract class can have a constructor
class Pen1 extends Writer{
	public void write(){
		System.out.println("Inside Pen");
	}
}
class Pencil1 extends Writer {
	public void write(){
		System.out.println("Inside Pencil");
	}
}
class Kit1{
	public void doSomething(Writer p) {
		p.write();
	}
}
public class AbstractVsInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kit1 k=new Kit1();
		Writer p=new Pen1();
		Writer pc=new Pencil1();
		k.doSomething(pc);
	}

}
