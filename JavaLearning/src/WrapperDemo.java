//int,float,double
//Integer
public class WrapperDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;//primitive data type
		Integer ii=new Integer(5); //wrapper class bcs in java everything has to be an object
		
		//Boxing or wrapping
		Integer i1=new Integer(i);
		
		//Unboxing or wrapping
		int j=i1.intValue();
		
		//Autoboxing
		Integer value=i;
		//AutoUnboxing
		int k=value;
		
		String str="123";
		int n=Integer.parseInt(str); //parseInt is a static method to access it Wrapper class is required
	}

}
