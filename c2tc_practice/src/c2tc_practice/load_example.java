package c2tc_practice;
import java.sql.*;

public class load_example {
	public static void main(String args[]) throws ClassNotFoundException{
//		Class.forName("c2tc_practice.load_example1");
		//Class.forName("/c2tc_practice/src/c2tc_practice/load_example1.java");
	String url="jdbc:mysql://localhost:3306/c2tc";
	String user="root";
	String pass="password";
	String query="select * from details";
	//String query1="insert into details values(14, rashika, 21)";
	//String query2="insert into details values("+ uid+","+name+","+age+")";
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url, user, pass);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	//int count=rs.executeUpdate(query);
	while(rs.next())
	System.out.println(rs.getInt(1)+":"+rs.getString(2)+":");
	//System.out.println("count of rows updated "+ count)
	st.close();
	con.close();
	
	}

}
