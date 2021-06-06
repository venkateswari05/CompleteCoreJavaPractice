package completecorejavacourse.DatabaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecords
{

	static final String DB_URL = "jdbc:mysql://localhost/mydatabase";
	static final String USER = "root";
	static final String PASS = "123456";
	public static void main(String[] args) 
	{
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				) 
		{		      
			
			System.out.println("Inserting records into the table...");          
			String sql = "INSERT INTO STUDENT VALUES (100, 'Zara', 'Ali', 18)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO STUDENT VALUES (101, 'Mahnaz', 'Fatma', 25)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO STUDENT VALUES (102, 'Zaid', 'Khan', 30)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO STUDENT VALUES(103, 'Sumit', 'Mittal', 28)";
			stmt.executeUpdate(sql);
			System.out.println("Inserted records into the table...");   	  
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}
}