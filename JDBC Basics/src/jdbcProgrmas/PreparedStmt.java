//WA JDBC program to insert a record  
package jdbcProgrmas;

import java.sql.*;

public class PreparedStmt {
	
   public static void main(String[] args) {
	    
	   String InQuery="insert into jejm21.emp values(?,?,?)";
	 
	   try {
			 //step 2
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver cls L&R");
		   
			//step 3
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Abhi@5333");
			 System.out.println("Connection establishMent success!..");
			
		     //step 4
			 PreparedStatement pstmt=con.prepareStatement(InQuery);      //where //Statement stmt=con.createStatement(); 
			 System.out.println("Statment/Platform created");
			 
			 System.out.println("Setting values of PlaceHOlder");
			 pstmt.setInt(1, 420);
			 pstmt.setString(2,"Mr Bean");
			 pstmt.setDouble(3, 1500.00);
			 
			//step 5
			int cnt=pstmt.executeUpdate();
			System.out.println("data Inserted sucesses... "+cnt);
			
		} 
	  catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

