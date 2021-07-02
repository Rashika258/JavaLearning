package c2tc.technoserve;

import java.sql.SQLException;

public class Details_Dao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Dao_layer d=new Dao_layer();
		Student s1=d.getStudent(12);
		System.out.println(s1.name);
		
	}

}
