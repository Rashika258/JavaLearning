package technoserve;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		Company c1=new Company();
		c1.setCid(123);
		c1.setName("Capgemini");
		s1.setId(753);
		s1.setName("Shreya");
		s1.setAge(20);
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
		
		
	}
}
