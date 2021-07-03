//Types of interface
//1.Normal
//2.Single Abstract Method - called as functional interface in Java8, 
//functional interface can be used to implement lamda expressions
//3.Marker interface


interface Writers{
	public abstract void write();
	void read();
	//methods inside interface are by default abstract
}
//interfaces are used to declare a method but it can't be defined
//all methods inside interface has to be abstract
//multiple classses can implement the same interface
//object of interface can't be created
interface Printers{
	
}
class Pen implements Writers, Printers{
	public void write(){
		System.out.println("Inside Pen");
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}
}
class Pencil {
	public void write(){
		System.out.println("Inside Pencil");
	}
}
class Kit{
	public void doSomething(Pen p) {
		p.write();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kit k=new Kit();
		Pen p=new Pen();
		Pencil pc=new Pencil();
		k.doSomething(p);
	}

}
