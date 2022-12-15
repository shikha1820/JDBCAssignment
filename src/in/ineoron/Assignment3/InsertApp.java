package in.ineoron.Assignment3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.ineuron.Assignment1.jdbcUtil;

public class InsertApp {

  public static void insertData(int sId, String sName, String sAddr) throws SQLException {
    String query = "insert into students values(?,?,?)";
    
    Connection con = jdbcUtil.getJdbcConnection();
    
    if(con!=null) {
      PreparedStatement ps = con.prepareStatement(query);
    
      if(ps!=null) {
        ps.setInt(1,sId);
        ps.setString(2, sName);
        ps.setString(3, sAddr);
        
       int noOfRows = ps.executeUpdate();
       System.out.println("No. of Rows Affected:: " + noOfRows);
      }
    }
    
    
    
    
    
  }
  

}
