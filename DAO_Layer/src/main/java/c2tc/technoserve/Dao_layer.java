package c2tc.technoserve;

import java.sql.*;
//DAo-Data access object layer
public class Dao_layer {
	public Student getStudent(int rollno) throws ClassNotFoundException, SQLException {
		Student s=new Student();
		s.uid=rollno;
		String url="jdbc:mysql://localhost:3306/c2tc";
		String uname="root";
		String pass="password";
		String query="Select * from details";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname, pass);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	rs.next();
	String name=rs.getString(1);
	s.name=name;
	
	}
}
