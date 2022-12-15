package in.ineuron.Assignment1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateApp {
  public static void updateData(int sId, String colName, String newValue) throws SQLException {
   
  Connection con =   jdbcUtil.getJdbcConnection();
  
  if(con!=null) {
    Statement st = con.createStatement();
    String updateSqlQuery = String.format("update students set sName = '%s' where sId= %d", newValue,sId);
    String updateSqlQuery1 = String.format("update students set sAddr = '%s' where sId= %d", newValue,sId);
    
    if(st!=null) {
      int noOfRows = 0;
      if(colName.equalsIgnoreCase("sName")) {
        noOfRows= st.executeUpdate(updateSqlQuery);
      }
      else if(colName.equalsIgnoreCase("sAddr")) {
        noOfRows = st.executeUpdate(updateSqlQuery1);
      }
      
      System.out.println("Data updated successfully!!\nNo of rows affected is :: " + noOfRows);
      System.out.println("\n===============================\n");
    }
    
    jdbcUtil.closeConnection(null, st, con);
  }
  
  }
}

