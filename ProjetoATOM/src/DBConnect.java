import java.sql.*;

public class DBConnect {

	private static Connection connection =  null;
	
	public static Connection getConnection() throws Exception {
		String url = "jdbc:mysql://localhost:3306/ATOM";
		String user="scott";
		String password="tiger";
		
		
		connection = DriverManager.getConnection(url,
				                                 user,
				                                 password);
		
		connection.setAutoCommit(true);
		
		return connection;
		
		} //else
		
	} //Connection
	