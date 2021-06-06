package completecorejavacourse.DatabaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable
{

	static final String DB_URL = "jdbc:mysql://localhost:3306/MYDATABASE";
	   static final String USER = "root";
	   static final String PASS = "123456";

	   public static void main(String[] args) {
	     
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement(); 
	      ){		      
	         String sql = "DROP TABLE REGISTRATION";
	         stmt.executeUpdate(sql);
	         System.out.println("table dropped successfully...");   	  
	      } catch (SQLException e) 
	      {
	         e.printStackTrace();
	      } 
	   }
}
