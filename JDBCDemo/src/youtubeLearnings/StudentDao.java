package youtubeLearnings;
import java.sql.*;

public class StudentDao {
	
	Connection con=null;
	public void connect() throws SQLException, ClassNotFoundException {
		String url="jdbc:mysql://localhost:3306/student";
		String uname="root";
		String pass="password";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url, uname, pass);
	}
	public Student getStudent(int rollno) {
		try {
		Student s=new Student();
		s.rollno=rollno;
		
		String query="select name from info where id="+rollno;

		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString(1);
		s.sname=name;
		return s;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
		return null;
	}
	
	public void addStudent(Student s) throws SQLException {
		String query="insert into info values(?,?); ";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, s.rollno);
		pst.setString(2, s.sname);
		pst.executeUpdate();
		
	}
}
