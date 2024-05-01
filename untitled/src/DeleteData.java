import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    public static void main(String[] args) {

        Statement statement = null;

        try {

            DatabaseConnect.connected();
            statement = DatabaseConnect.connect.createStatement();

            // Delete With Statement
            String updateQuery = "DELETE FROM student WHERE student_id = 3";
            statement.executeUpdate(updateQuery);

            // Delete With Prepared Statement
            //   PreparedStatement pr = DatabaseConnect.connect.prepareStatement("DELETE FROM student WHERE student_id = ?");
            //  pr.setInt(1,2);
            //  pr.executeUpdate();

            statement.close();

        }catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
    }
}