public class UserDefinedExceptionDemo {
	public static void main(String[] args) {
		int i,j;
		i=8;
		j=7;
		try {
			int k=i/j;
			if(k==0)
//				throw new Exception();
				throw new User_1_Exception();
			System.out.println(k);
		}
		catch(Exception e) {
			System.out.println("Error "+e);
		}
	}

}
