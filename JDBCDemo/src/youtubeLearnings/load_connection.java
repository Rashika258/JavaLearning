package youtubeLearnings;
import java.sql.*;

public class load_connection {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    // TODO Auto-generated method stub
    String url = "jdbc:mysql://localhost:3306/student";
    String uname = "root";
    String pass = "password";
    String query = "Select * from info where id=1";

    //				When you are using JDBC outside of an application server, the DriverManager class manages the establishment of connections.

    //				Specify to the DriverManager which JDBC drivers to try to make Connections with.
    //		error-Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'
    Class.forName("com.mysql.jdbc.Driver");
    //		obtain a Connection instance from the DriverManager.
    Connection con = DriverManager.getConnection(url, uname, pass);
    //			Once a Connection is established, it can be used to create Statement and PreparedStatement objects, as well as retrieve metadata about the database. 

    //			Statement objects allow you to execute basic SQL queries and retrieve the results through the ResultSet class
    //			To create a Statement instance, you call the createStatement() method on the Connection object you have retrieved using one of the DriverManager.getConnection() or DataSource.getConnection() methods

    //			Once you have a Statement instance, you can execute a SELECT query by calling the executeQuery(String) method with the SQL you want to use.

    //			To update data in the database, use the executeUpdate(String SQL) method. This method returns the number of rows matched by the update statement, not the number of rows that were modified.

    //			If you do not know ahead of time whether the SQL statement will be a SELECT or an UPDATE/INSERT, then you can use the execute(String SQL) method. This method will return true if the SQL query was a SELECT, or false if it was an UPDATE, INSERT, or DELETE statement. If the statement was a SELECT query, you can retrieve the results by calling the getResultSet() method. If the statement was an UPDATE, INSERT, or DELETE statement, you can retrieve the affected rows count by calling getUpdateCount() on the Statement instance.

    Statement st = con.createStatement();
    //			resultset allows to fetch selected rows along with table structure
    ResultSet rs = st.executeQuery(query);
    //			bcs pointer initially will be next to table headinng to get the first selected ro, move the pointer to nect line
    rs.next();
    int uid = rs.getInt("id");
    String name = rs.getString(2);

    System.out.println(uid + "\t" + name);
    st.close();
    con.close();

  }

}