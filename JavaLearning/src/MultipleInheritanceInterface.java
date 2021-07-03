interface Demo1 {
	void abc();
	default void show() {
		System.out.println("Inside Demo1 show");
	}
}
interface Demo2 {
	void abc();
	default void show() {
		System.out.println("Inside Demo2 show");
	}
}
class Imp implements Demo1, Demo2 {

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("In abc");
	}
	public void show() {
		System.out.println("In DemoImp show");
	}
	
}
public class MultipleInheritanceInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imp obj=new Imp();
		obj.abc();
		obj.show();
	}

}
