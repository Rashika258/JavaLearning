interface Mobile {
	void show();
}
public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj=() -> System.out.println("Inside Mobile");
		obj.show();
	}

}
