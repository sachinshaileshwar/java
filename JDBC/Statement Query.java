import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcMysql {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/mydatabase"; 
        String username = "root";
        String password = "Sachin@2245";

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("✅ Connected to the database!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");

            while (resultSet.next()) {
                String columnValue = resultSet.getString("name");
                int columnValue2 = resultSet.getInt("id");
                System.out.println("Id: " + columnValue2 + " " + "Name: " + columnValue);
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
