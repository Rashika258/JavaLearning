//this class is Abstract class
abstract class Human {
	//instead of defining methods it can also be declared and name it as abstract
	//for methods to be declared we require abstract keyword
	//abstract class should be declared inside abstract class
	abstract void stand();
	public void eat() {
		
	}
	public void walk() {
		
	}
}
//this class is called concrete class
class Man extends Human {
	//when extending abstract class the undefined methods should be defined
	public void stand() {
		
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.abstract class can't be instantiated
		//objects can be created with human but the actual object is implemented in mam
		Human obj=new Man();
	}

}
