class Mouse{
	public void show() {
		System.out.println("Inside mouse show");
	}
}
class Clickmouse extends Mouse{
	public void show() {
		System.out.println("Inside Clickmouse show");
	}
}
//class that doesn't have name is called anonymous class
public class AnonymouisExampleDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mouse obj=new Clickmouse();
		//instead of calling another class the method can be defined inside curly braces using anonymous classes,
		//anonymous class - one time use, can't be reused
		Mouse obj=new Mouse() {
															public void show() {
																System.out.println("Inside Clickmouse show");
															}
													};
		obj.show();
	}

}
