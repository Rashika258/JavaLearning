class Outer{
	int a;
	public void show() {
		System.out.println("Inside outer display");
	}
	
	class Inner{
		public void display() {
			System.out.println("Inside inner display");
		}
	}
}
public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj=new Outer();
		obj.show();
		//to access method in class that is present inside another class
		//declare outer.inner class object name = outer object.new inner class()
		Outer.Inner obj1=obj.new Inner();
		obj1.display();
	}

}
