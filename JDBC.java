//read data from data base

import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "ABC";
        String query = "SELECT*FROM student";
        //String query1 = "INSERT INTO student VALUES('gayan',23,88)";
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            //statement.executeUpdate(query1);

            String name;
            int age;
            int mathsMarks;

            while (result.next()){
              name = result.getString("name");
              age = result.getInt("age");
              mathsMarks = result.getInt("mathsMarks");

              System.out.println(name+" "+ age+" "+mathsMarks);
            }
            connection.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
