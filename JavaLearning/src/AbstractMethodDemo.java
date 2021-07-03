//in java 8 static methods can be defined
@FunctionalInterface
interface StaticDemo {
	//variables declared inside the interface are by default considered as final even though it isn't specified, so it can't be accessed while implementation
	int i=8;
	void abc();
	static void show() {
		System.out.println("Inside static");
	}
}
class StaticImp implements StaticDemo {
	public void abc() {
		//can't be reinitialised because it's final
		//i=10;
	}
}
public class AbstractMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
