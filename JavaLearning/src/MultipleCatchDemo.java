
public class MultipleCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[6];
			a[4]=2;
			a[6]=5;
			a[7]=6;
			int j=10/0;
			System.out.println("Output is "+j);
		}
		//introduced in >1.7 versions
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.err.println("Error ");
		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.err.println("Error");
//		}
	}

}
