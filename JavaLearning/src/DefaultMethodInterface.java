//Abstract class -> define and declare
//interface -> declare ->1.7
//1.8 can define methods in interface
@FunctionalInterface
interface Demo {
	void abc();
	//abstract methods don't have body so use default keyword
	default void show() {
		System.out.println("Inside show in Demo Interface");
	}
}
//default method can be overided using class
class DemoImp implements Demo {

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("In abc");
	}
	public void show() {
		System.out.println("In new show");
	}
	
}
public class DefaultMethodInterface {
	public static void main(String[] args) {
		Demo obj=new DemoImp();
		obj.abc();
		obj.show();
	}
}
