package in.ineuron.Assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcUtil {

  public static Connection getJdbcConnection() throws SQLException {
    Connection connection = null;
    
    String url = "jdbc:mysql://localhost:3306/college";
    String user = "root";
    String password = "root";
    
    connection = DriverManager.getConnection(url, user, password);
    
    if(connection!=null){
      return connection;
    }
    return connection;
    
  }
  
  public static void closeConnection(ResultSet resultSet, Statement statement, Connection connection)
      throws SQLException {

    if (resultSet != null) {
      resultSet.close();
    }
    if (statement != null) {
      statement.close();

    }
    if (connection != null) {
      connection.close();
    }
  }
}
