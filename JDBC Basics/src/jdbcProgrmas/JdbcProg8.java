//delete a record with,Dynamic input from user ,,using Prepared Statement and PlaceHolder and setXXX method;
package jdbcProgrmas;

import java.sql.*;
import java.util.Scanner;

public class JdbcProg8 {
	
   public static void main(String[] args) {
	   
	  
	   Scanner scan=new Scanner(System.in);
	   String DelQuery="delete from jejm21.emp where empno=?";
	 
	   try {
			 //step 2
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver cls L&R");
		   
			//step 3
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Abhi@5333");
			 System.out.println("Connection establishMent success!..");
			
			 
		     //step 4
			 PreparedStatement pstmt=con.prepareStatement(DelQuery);      //where //Statement stmt=con.createStatement(); 
			 System.out.println("Statment/Platform created");
			 
			 System.out.println("Setting values of PlaceHOlder");
			 
			while(true) {
				 System.out.println("Enter Ur choice\n 1: To Delete Data\n 2: To exit");
				 int choice=scan.nextInt();
				 
				 switch(choice) {
				 case 1:  System.out.println("Setting values of PlaceHOlder");			 
						  System.out.print("Enter emp Number to Delete : ");
						  int empNo=scan.nextInt();
				
				          pstmt.setInt(1,empNo);
		
							//step 5
							int cnt=pstmt.executeUpdate();			
							System.out.println(cnt==0 ? "No such empNo found" : "Record Deleted Successfully..."+cnt);
									System.out.println("-------------------------------------");
									break;
						
				 case 2: 
					 System.out.println("Thank you !...");
					 System.exit(0)		;
				 }
				
			}
			
		} 
	  catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

