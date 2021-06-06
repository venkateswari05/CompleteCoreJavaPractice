package completecorejavacourse.DatabaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatement 
{
	static final String DB_URL = "jdbc:mysql://localhost/mydatabase";
	static final String USER = "root";
	static final String PASS = "123456";
	private static final String student = "INSERT INTO student (id, first, last,age) VALUES (?,?,?,?)";
	public static void main(String[] args)
	{

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				java.sql.PreparedStatement preparedStatement = conn.prepareStatement(student)) 
		{

			preparedStatement.setInt(1, 3);
			preparedStatement.setString(2, "Psychoo");
			preparedStatement.setString(3, "mallina");
			preparedStatement.setInt(4, 50);
			int row = preparedStatement.executeUpdate();

			System.out.println(row); 
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
