interface Keyboard{
	void click();
}
//the only purpose of clicker is to implement click() method 
//objects of interface can't be created bcs it doesn't have implementation
class Clicker implements Keyboard{
	public void click() {
		System.out.println("Clicked");
	}
}
public class AnonymousClassWithInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keyboard obj=new Keyboard() {

			@Override
			public void click() {
				// TODO Auto-generated method stub
				System.out.println("Clicked");
			}
			
		};
	}

}
