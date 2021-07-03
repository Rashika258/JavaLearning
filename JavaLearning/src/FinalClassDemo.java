final class Abc{
	public void shows() {
		System.out.println("In show");
	}
}
//final class can't be extended by any other method

public class FinalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj=new Abc();
		obj.shows();
	}

}
