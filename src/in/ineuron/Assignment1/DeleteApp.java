package in.ineuron.Assignment1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteApp {
  public static void deleteData(int sId) throws SQLException {
    
    Connection con =   jdbcUtil.getJdbcConnection();
    Statement st = con.createStatement();
    
    String query = String.format("delete from students where sId = %d", sId);
    
    int noOfRows = st.executeUpdate(query);
    System.out.println("Data deleted successfully!!\nNo of rows affected is :: " + noOfRows);
    System.out.println("\n===============================\n");
    jdbcUtil.closeConnection(null, st, con);
    
    }

}
