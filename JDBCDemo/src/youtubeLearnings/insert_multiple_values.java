package youtubeLearnings;
import java.sql.*;
import java.util.Scanner;

public class insert_multiple_values {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    // TODO Auto-generated method stub
    String url = "jdbc:mysql://localhost:3306/student";
    String uname = "root";
    String pass = "password";
    
    Scanner in=new Scanner(System.in);
    System.out.println("Enter id ");
    
    int sid=in.nextInt();
    System.out.println("Enter sname ");
    String sname=in.next();
//  String sname="ram";
//  int sid=9;
  String query="insert into info values(?,?);";

    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection(url, uname, pass);

    PreparedStatement st = con.prepareStatement(query);
    st.setInt(1,sid);
    st.setString(2, sname);

    int count = st.executeUpdate();

    System.out.println("Number of rows affected : " +count );

    st.close();
    con.close();

  }

}