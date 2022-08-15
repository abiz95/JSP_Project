package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    @SuppressWarnings("deprecation")
	public static Connection initializeDatabase()
            throws SQLException, ClassNotFoundException,  Exception
        {
            // Initialize all the information regarding
            // Database Connection
            String dbDriver = "com.mysql.cj.jdbc.Driver";
            String dbURL = "jdbc:mysql:// localhost:3306/";
            // Database name to access
            String dbName = "c4computer";
            String dbUsername = "root";
            String dbPassword = "root";
      
//            Class.forName(dbDriver);
            Class.forName(dbDriver).newInstance();
            Connection conn = DriverManager.getConnection(dbURL + dbName,
                                                         dbUsername, 
                                                         dbPassword);
            return conn;
        }
}
