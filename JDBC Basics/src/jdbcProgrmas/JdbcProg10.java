//Insert,update,delete ,in a single Jdbc Program..
package jdbcProgrmas;
 import java.sql.*;  //1
import java.util.Scanner;
 
public class JdbcProg10 {
	 Scanner scan=new Scanner(System.in);
	 
	  void Insert() {
		 
	  }
	  
	  
	
  public static void main(String[] args) {
	  
	 String InQuery="insert into jejm21.emp values(?,?,?)";
	 String UpQuery="update jejm21.emp set esal=? where empno=?";
	 String DelQuery="delete from jejm21.emp where empno=?";
	
	 Scanner scan=new Scanner(System.in);
	 
		 try {
			Class.forName("com.mysql.jdbc.Driver");//2
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Abhi@5333");//3
			
			System.out.println("what Operation U want to Do ? \n1:Insert Employee Details\n2:Update Emp Details\n3:Delete Emp Details");
			System.out.print("Enter Ur Choice : ");
			
			
			int choice=scan.nextInt();
			 PreparedStatement pstmt=null;
			switch(choice) {
			
			case 1:   System.out.print("enter EmpNo : ");
					  int empNo=scan.nextInt();
					  System.out.print("enter EmpName : ");
					  String empName=scan.next();
					  System.out.print("enter EmpSalary : ");
					  double empSal=scan.nextDouble();
					  pstmt=con.prepareStatement(InQuery);
					  pstmt.setInt(1, empNo);
					  pstmt.setString(2, empName);
					  pstmt.setDouble(3, empSal);
					  break;
			
		 	case 2 :   System.out.print("enter EmpNo : ");
				      empNo=scan.nextInt();
				      System.out.print("enter EmpSalary to Update : ");
				      empSal=scan.nextDouble();
					  pstmt=con.prepareStatement(UpQuery);
					  pstmt.setInt(2, empNo);
					  pstmt.setDouble(1, empSal);
					  break;
					  
		 	case 3:  System.out.println("Enter EmpNo u want To delete");
		 	          empNo=scan.nextInt();		     
					  pstmt=con.prepareStatement(DelQuery);
					  pstmt.setInt(1,empNo);
					  break;
              
		    default: System.out.println("Invalid Choice:");
		  
		      }
			
			  int cnt=pstmt.executeUpdate();
			  System.out.println(cnt==0?"Operation UnSuccessfull":"Success :"+cnt);
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //2
		 
		
}
}
