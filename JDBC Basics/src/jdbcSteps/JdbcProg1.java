package jdbcSteps;

import java.sql.*;  //1st step

public class JdbcProg1 {

	public static void main(String[] args) {
		 
		
		Connection con=null;  //3rd step a
		Statement stmt=null;   //4th step a
		
	
		try {
			//2nd step	
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Sql driver cls loaded and Registered....");
			System.out.println("wait for Connection to be Establish...");
			
			//3rd step b
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Abhi@5333");
		    System.out.println("Connection establised between JA and DB....");
		    
		    //4th step b
		    stmt=con.createStatement();
		    System.out.println("statement or Platform created");
		    
		    //5th step
		    stmt.execute("sql querry");  //we can use->   String query="sql query";  then u can pass like->  stmt.execute(query);
		    System.out.println("query executed....");
		} 
		
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	} 
}
