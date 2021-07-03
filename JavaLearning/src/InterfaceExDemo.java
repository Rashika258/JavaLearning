interface X{
	void show();
}
class Implementor implements X{
	public void show() {
		System.out.println("Anything");
	}
}
public class InterfaceExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X obj=new Implementor();
		obj.show();
		//create reference interface and object of class that implements the method declared inside interface and 
	}

}
