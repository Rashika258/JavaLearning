
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=10/0;
			System.out.println(i);
		}
		catch(Exception e) {
			System.out.println("Error"+e);
			System.err.print("Error"+e);
		}
		finally {
			System.out.println("Bye");
		}
	}

}
