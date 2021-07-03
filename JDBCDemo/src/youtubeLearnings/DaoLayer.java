package youtubeLearnings;

import java.sql.SQLException;

public class DaoLayer {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		StudentDao dao=new StudentDao();
		//dao=data access object layer
		//retrieves data
		//Student s1=dao.getStudent(1);
		Student s2=new Student();
		s2.rollno=20;
		s2.sname="archana";
		dao.connect();
		dao.addStudent(s2);
		//System.out.println(s1.sname);
	}

}
