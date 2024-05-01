import java.sql.*;

public class DatabaseConnect {
    public static final String DB_URL = "jdbc:mysql://localhost/homework";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";
    public static Connection connect = null;

    public static void connected(){
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USERNAME,DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Vendor Error: " + e.getErrorCode());
        }
    }

}