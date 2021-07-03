//delete a record with dynamic input ,using Prepared Statement and PlaceHolder and setXXX method;

package jdbcProgrmas;

import java.sql.*;
import java.util.Scanner;

public class JdbcProg9b {
	
   public static void main(String[] args) {
	   
	  
	   Scanner scan=new Scanner(System.in);
	   String UpQuery="update jejm21.emp set esal=? where empno=? ";	 
	   try {
			 //step 2
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver cls L&R");
		   
			//step 3
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Abhi@5333");
			 System.out.println("Connection establishMent success!..");
			
			 
		     //step 4
			 PreparedStatement pstmt=con.prepareStatement(UpQuery);      //where //Statement stmt=con.createStatement(); 
			 System.out.println("Statment/Platform created");
			 
			 System.out.println("Setting values of PlaceHOlder");
			 
			while(true) {
				
				 System.out.print("Enter emp Number to Update : ");
				 int empNo=scan.nextInt();
				 System.out.print("Enter Sal u want to Update : ");
				 double eSal=scan.nextDouble();
				
				 pstmt.setInt(2,empNo);
				 pstmt.setDouble(1,eSal);
						 
				//step 5
				int cnt=pstmt.executeUpdate();
				
				System.out.println(cnt==0 ? "No such empNo found" : "Record Updated Successfully..."+cnt);
				System.out.println("Do u want Update More Data : yes/no");
				String choice=scan.next();
				if(choice.equalsIgnoreCase("no")) {	
					  System.out.println("Thank u...");
					  break;
				}
			}
		} 
	  catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

