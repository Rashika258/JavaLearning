class Emp {
	int id;
	String name;
	int age;
	public Emp() {
		System.out.println("Default constructor is called");
	}
	public Emp(int id) {
		this.id =id;
		System.out.println("Id"+id);
	}
	public Emp(double id) {
		age=(int)id;
	}
	public void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
	
}
public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp obj=new Emp();
		obj.id=1;
		obj.name="Rashika";
		obj.age=21;
		obj.show();
		
		Emp obj1=new Emp(10);
		obj1.show();
		
		
		
		
	}

}
