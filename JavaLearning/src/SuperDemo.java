class Pqr{
	public Pqr() {
		System.out.println("In Pqr");
	}
	public Pqr(int i) {
		System.out.println("In Pqr int");
	}
}
class B extends Pqr{
	public B() {
		//child class constructor by default will call super class constructor 
		//ie super() is getting invoked by default
		System.out.println("In B");
	}
	public B(int i) {
		//default cpnstructor will be called by default
		//by passing parameterised constr p constr of super class will be called
	//	super(i);
		System.out.println("In B int");
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A obj1=new A();
		//obj of subclass also calls constructor of super class
		B obj1=new B(1);
	}

}
