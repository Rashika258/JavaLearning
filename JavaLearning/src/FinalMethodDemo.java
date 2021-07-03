class AA{
	public final void show() {
		System.out.println("Inside show of A");
	}
}
//methods declared as final can't be extended
class P extends AA{
	public void shows() {
		System.out.println("Inside B show");
	}
}
public class FinalMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P obj=new P();
		obj.show();
	}

}
