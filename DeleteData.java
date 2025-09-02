import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "ABC";
        String query1 = "DELETE FROM student WHERE age=24";

        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(query1);
            System.out.println("successfully deleted");



            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}