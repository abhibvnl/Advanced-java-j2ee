//insert program  //using Statement InterFace
package jdbcProgrmas;

import java.sql.*;  //1st step

public class JdbcProg2 {

	public static void main(String[] args) {
	
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
		//boolean status=stmt.execute("insert into jejm21.emp values(123,'Mr Uday',5000.00)");  //DML returns false, if success
		int cnt=stmt.executeUpdate("insert into jejm21.emp values(124,'Mr Keshav',8000.00)");
		System.out.println("data inserted sucesses... "+cnt);
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}