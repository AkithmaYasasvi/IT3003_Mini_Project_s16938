import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "ABC";
        String query1 = "UPDATE student SET age =21 WHERE name='saman'";

        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            System.out.println("successfully updated");

            statement.executeUpdate(query1);


            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
