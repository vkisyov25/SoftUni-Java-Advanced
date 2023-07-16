//import java.sql.*;
//
//public class MyJDBC {
//    public static void main(String[] args) {
//        try {
//
//            Connection connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/sirmaInternshipProject",
//                    "root", "vvvvmmmm2513");
//
//            Statement statement = connection.createStatement();
//
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
//
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("username"));
//            }
//
//            // Close the resources
//            resultSet.close();
//            statement.close();
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sirmaInternshipProject";
        String username = "root";
        String password = "vvvvmmmm2513";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {

            // Вмъкнете заявките за вкарване на стойности в таблиците
            String insertUsersQuery = "INSERT INTO users (username, password) VALUES " +
                    "('ventsy1', 'v1'), " +
                    "('ventsy2', 'v2'), " +
                    "('ventsy3', 'v3')";
            statement.executeUpdate(insertUsersQuery);

            System.out.println("Стойностите са успешно вкарани в базата данни.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
