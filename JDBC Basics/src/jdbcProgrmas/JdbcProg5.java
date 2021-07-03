//insert data..with Dynamic input from user ,,using Prepared Statement and PlaceHolder and setXXX method;
package jdbcProgrmas;

import java.sql.*;
import java.util.Scanner;

public class JdbcProg5 {
	
   public static void main(String[] args) {
	   
	  
	   Scanner scan=new Scanner(System.in);
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
			 
			 System.out.print("Enter ur emp Number : ");
			 int empNo=scan.nextInt();
			 System.out.print("Enter ur emp Name : ");
			 String empName=scan.next();
			 System.out.print("Enter ur emp salary : ");
			 double empSal=scan.nextDouble();
			 
			 pstmt.setInt(1,empNo);
			 pstmt.setString(2,empName);
			 pstmt.setDouble(3, empSal);
			 
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

