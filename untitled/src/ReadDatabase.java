import java.sql.*;

public class ReadDatabase {
    public static void main(String[] args) {
        Statement statement = null;
        try {
            DatabaseConnect.connected();
            statement = DatabaseConnect.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
            while (resultSet.next()){
                System.out.println("ID : " + resultSet.getInt("student_id"));
                System.out.println("Adı : " + resultSet.getString("student_name"));
                System.out.println("Sınıfı : " + resultSet.getInt("student_class"));
                System.out.println("#################");
            }
        }catch (SQLException e){
            System.out.println("SQL Exception: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Vendor Error: " + e.getErrorCode());
        }
    }
}