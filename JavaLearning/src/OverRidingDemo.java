class AB{
	public void show() {
		System.out.println("In A");
	}
}
class BB extends AB{
	public void show() {
		System.out.println("In B");
	}
}
public class OverRidingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB obj1=new BB();
		obj1.show();
	}

}
