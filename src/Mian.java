import java.sql.*;

public class Mian {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/SMS");
        Statement statement=connection.createStatement();
        ResultSet resultSet =statement.executeQuery("show databases");
        while(resultSet.next()){
            String table=resultSet.getNString(1);
            System.out.println(String.format(table));
        }
        resultSet.close();
    }
}
