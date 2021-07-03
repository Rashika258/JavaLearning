class Printer {
//	public void show(Integer i) {
//		System.out.println(i);
//	}
//	//Method overriding
//	public void show(Double i) {
//		System.out.println(i);
//	}
	/*
	 * instead of using abouve two methos Number can be used which is abstract class
	 */
	public void show(Number i) {
		System.out.println(i);
		}
 }
public class AbstractDemoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer obj=new Printer();
		obj.show(5) ;//o/p -5
		obj.show(5.5);//o/p-5;
	}

}
