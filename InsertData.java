import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "ABC";
        String query1 = "INSERT INTO student VALUES('Ramani',23,88)";

        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();

            int row = statement.executeUpdate(query1);
            System.out.println(row + " recod inserted");


            connection.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
