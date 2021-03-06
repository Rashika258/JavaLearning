import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Student implements Comparable<Student> {
	int roll_no, marks;
	String name;
	public Student(int roll_no, int marks, String name) {
		super();
		this.roll_no = roll_no;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", marks=" + marks + ", name=" + name + "]";
	}
//	public int compareTo(Student s) {
//		return marks>s.marks?1:-1;
//	}
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return marks>s.marks?1:-1;
	}

}
public class ComparableInterfaceDemo {

	public static void main(String[] args) {
		List<Student> studs=new ArrayList<>();
		studs.add(new Student(1, 21, "rashika1"));
		studs.add(new Student(2, 30, "rashika2"));
		studs.add(new Student(3, 25, "rashika3"));
		studs.add(new Student(4, 38, "rashika4"));
		//to sort objects comparable interface has to be implemented
		Collections.sort(studs,(i,j)->i.roll_no<j.roll_no?-1:1);
		for(Student s:studs) {
			//will call tostring Method
			System.out.println(s);
		}
	}

}
