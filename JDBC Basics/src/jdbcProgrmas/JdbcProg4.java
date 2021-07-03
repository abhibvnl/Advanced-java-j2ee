//update a record  //using Statement InterFace
package jdbcProgrmas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProg4 {
   public static void main(String[] args) {
	  String UpQuery="update jejm21.emp set esal=10000.00 where empno=123 ";
	  try {
			 //step 2
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver cls L&R");
		   
			//step 3
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Abhi@5333");
			System.out.println("Connection establishMent success!..");
			
		   //step 4
			Statement stmt=con.createStatement();
			System.out.println("Stament created");
			
			//step 5
			int cnt=stmt.executeUpdate(UpQuery);
			System.out.println("data Updated sucesses... "+cnt);
			
		} 
	  catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

