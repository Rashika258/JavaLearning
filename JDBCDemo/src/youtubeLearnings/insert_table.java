package youtubeLearnings;
import java.sql.*;

public class insert_table {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    // TODO Auto-generated method stub
    String url = "jdbc:mysql://localhost:3306/student";
    String uname = "root";
    String pass = "password";
    
    //by passing direct values
    //String query = "insert into info values(7,'rakesh');";
    
    //by passing variable names as values
    String sname="ranjith";
    int sid=8;
    String query= "insert into info values("+sid+",\'"+sname+"\')";
    
    //ddl=modify the structure of the table
    //dml=insert or update and manipulate table
    //dql=retrieve the value from table
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection(url, uname, pass);

    Statement st = con.createStatement();

    int count = st.executeUpdate(query);

    System.out.println("Number of rows affected : " +count );

    st.close();
    con.close();

  }

}