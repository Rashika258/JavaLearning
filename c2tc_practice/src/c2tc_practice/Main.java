package c2tc_practice;
import java.sql.*;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/c2tc";
		String user="root";
		String pass="password";
		String query="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, user, pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
	}
}
