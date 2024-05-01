import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AddData {
    public static void main(String[] args) {
        Statement statement = null;
        try {
            DatabaseConnect.connected();
            statement = DatabaseConnect.connect.createStatement();

            // Insert With Statement:
            String updateQuery = "INSERT INTO student (student_name, student_class) VALUES ('BARIŞ',8)";
            statement.executeUpdate(updateQuery);

            // Insert With Prepared Statement
            //  PreparedStatement preparedStatement = DatabaseConnect.connect.prepareStatement("INSERT INTO student (student_name,student_class) VALUES (?,?)");
            // preparedStatement.setString(1,"Harry");
            //  preparedStatement.executeUpdate();

            statement.close();


        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }


    }
}