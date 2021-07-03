class Emp3{
	int id;
	String name;
	static String ceo;
	//static variables aren't object specific
	//to access static variables objects aren't required
	//to access main method similarly object isn't required
	
	//static block is used to initialise static variables
	//static will executed first
	
	static { //when class is loaded
		ceo="larry";
		System.out.println("Static constructor");
	}
	
	public Emp3(){
		id=1;
		name="rashika";
		System.out.println("Inside constructor");
		
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(name + ceo+ id);
	}
	
}
public class StringDemo {
	static int i=0;
	public static void main(String[] args) {
		//non static variables cannot be accessed inside static variables
		i=9;
		Emp3 n=new Emp3();
		n.id=8;
		n.name="rashi";
		n.ceo="Mahesh";
		
		Emp3 r=new Emp3();
		r.id=9;
		r.name="rashika";
		r.ceo="Mahesh";
		
		r.ceo="varsha";
		
		n.show();
		r.show();
		
	}
}
