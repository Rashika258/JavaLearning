package youtubeLearnings;

import java.sql.DriverManager;

class Xyz {
	  static {
	    System.out.println("Inside static");
	  } {
	    System.out.println("Inside instance");
	  }
	}
public class forNameDemo {

  public static void main(String[] args) throws Exception{
    // TODO Auto-generated method stub
    //while creating class static block will be called
    //while object is created instance block will be called automatically

    //		Pqr obj=new Pqr();

    //so it is required to only load the class, so use Class.forName

    //loads the class
    //		Class.forName("/JDBCDemo/src/youtubeLearnings/Xyz.java");
    //		//loads the class with object
    //		@SuppressWarnings("deprecation")
    //		Object newInstance = Class.forName("/JDBCDemo/src/youtubeLearnings/Xyz.java").newInstance();
    //		System.out.println(newInstance);
	  
	  Class.forName("com.mysql.jdbc.Driver");
//	  DriverManager.registerDriver(new com.mysql.jdbc.Driver());

  }

}

