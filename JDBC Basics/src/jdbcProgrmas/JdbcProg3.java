// delete a record  //using Statement InterFace
package jdbcProgrmas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProg3 {
   public static void main(String[] args) {
	  String delQuery="delete from jejm21.emp where empno=124 ";
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
			int cnt=stmt.executeUpdate(delQuery);
			System.out.println("data Deleted sucesses... "+cnt);
			
		} 
	  catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

